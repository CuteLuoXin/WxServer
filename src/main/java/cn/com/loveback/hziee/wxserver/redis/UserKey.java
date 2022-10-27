package cn.com.loveback.hziee.wxserver.redis;

/**
 * @projectName: WxServer
 * @package: cn.com.loveback.hziee.wxserver.redis
 * @className: UserKey
 * @author: K-Luo
 * @description: TODO
 * @date: 2022/10/26 21:58
 * @version: 1.0
 */
public class UserKey extends SimplePrefix{
    public UserKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public static UserKey UserList=new UserKey(60*5,"user");
}
