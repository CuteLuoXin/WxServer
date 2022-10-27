package cn.com.loveback.hziee.wxserver.redis;

public interface KeyPrefix {
	public int expireSeconds();
	public String getPrefix();
}
