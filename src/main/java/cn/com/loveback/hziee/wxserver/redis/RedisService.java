package cn.com.loveback.hziee.wxserver.redis;
import java.util.ArrayList;

import java.util.List;

import cn.com.loveback.hziee.wxserver.tool.date.BeanAndString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;


@Service
public class RedisService {
	@Autowired
	JedisPool jedisPool;
	//Redis的get方法，获取key-value中的value。
	public <T> T get(KeyPrefix prefix, String key,  Class<T> clazz) {
		 Jedis jedis = null;
		 try {
			 jedis =  jedisPool.getResource();
			 //生成真正的key,使用prefix对输入的key进行拼接，防止出现重复的key，造成数据丢失。
			 String realKey  = prefix.getPrefix() + key;
			 String  str = jedis.get(realKey);
			 if(str==null) {
				 return null;
			 }
			 //将数据库中的获得的对象字符串资源转化为javaBean对象。
			 T t =  BeanAndString.stringToBean(str, clazz);
			 return t;
		 }finally {
			 //Redis数据库用完之后释放资源，并不是关闭，将资源返回jedisPool。
			  returnToPool(jedis);
		 }
	}
	
	
	//Redis中的set方法，设置过期时间。
	public <T> boolean set(KeyPrefix prefix, String key,  T value) {
		 Jedis jedis = null;
		 try {
			 jedis =  jedisPool.getResource();
			 String str = BeanAndString.beanToString(value);
			 if(str == null || str.length() <= 0) {
				 return false;
			 }
			//生成真正的key
			 String realKey  = prefix.getPrefix() + key;
			 //System.out.println(realKey);
			 //获取过期时间。
			 int seconds =  prefix.expireSeconds();
			 //如果过期时间小于等于0，则证明永久有效，直接set()，若大于0，则设置过期时间。
			 if(seconds <= 0) {
				 jedis.set(realKey, str);
			 }else {
				 jedis.psetex(realKey, seconds*1000, str);
			 }
			 return true;
		 }finally {
			 //将资源释放，返回到连接池中。
			  returnToPool(jedis);
		 }
	}
	
	
	public <T> boolean exists(KeyPrefix prefix, String key) {
		 Jedis jedis = null;
		 try {
			 jedis =  jedisPool.getResource();
			//生成真正的key
			 String realKey  = prefix.getPrefix() + key;
			return  jedis.exists(realKey);
		 }finally {
			  returnToPool(jedis);
		 }
	}
	
	
	public boolean delete(KeyPrefix prefix, String key) {
		 Jedis jedis = null;
		 try {
			 jedis =  jedisPool.getResource();
			//生成真正的key
			String realKey  = prefix.getPrefix() + key;
			long ret =  jedis.del(realKey);
			return ret > 0;
		 }finally {
			  returnToPool(jedis);
		 }
	}
	

	//增加value的值
	public <T> Long incr(KeyPrefix prefix, String key) {
		 Jedis jedis = null;
		 try {
			 jedis =  jedisPool.getResource();
			//生成真正的key
			 String realKey  = prefix.getPrefix() + key;
			return  jedis.incr(realKey);
		 }finally {
			  returnToPool(jedis);
		 }
	}
	
	
	//减少value的值
	public <T> Long decr(KeyPrefix prefix, String key) {
		 Jedis jedis = null;
		 try {
			 jedis =  jedisPool.getResource();
			//生成真正的key
			 String realKey  = prefix.getPrefix() + key;
			return  jedis.decr(realKey);
		 }finally {
			  returnToPool(jedis);
		 }
	}


	
	
	//删除方法
	public boolean delete(KeyPrefix prefix) {
		if(prefix == null) {
			return false;
		}
		List<String> keys = scanKeys(prefix.getPrefix());
		if(keys==null || keys.size() <= 0) {
			return true;
		}
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			jedis.del(keys.toArray(new String[0]));
			return true;
		} catch (final Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if(jedis != null) {
				jedis.close();
			}
		}
	}
	
	//删除方法
	public List<String> scanKeys(String key) {
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			List<String> keys = new ArrayList<String>();
			String cursor = "0";
			ScanParams sp = new ScanParams();
			sp.match("*"+key+"*");
			sp.count(100);
			do{
				ScanResult<String> ret = jedis.scan(cursor, sp);
				List<String> result = ret.getResult();
				if(result!=null && result.size() > 0){
					keys.addAll(result);
				}
				//再处理cursor
				cursor = ret.getCursor();
			}while(!cursor.equals("0"));
			return keys;
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}
	}
	
	
	//将资源返回到连接池。
	private void returnToPool(Jedis jedis) {
		 if(jedis != null) {
			 jedis.close();
		 }
	}
}
