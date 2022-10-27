package cn.com.loveback.hziee.wxserver.redis;

public abstract class SimplePrefix implements KeyPrefix{
	private int expireSeconds;
	private String prefix;
	
	public SimplePrefix(String prefix) {
		this(0,prefix);
	}
	public SimplePrefix(int expireSeconds,String prefix) {
		this.expireSeconds=expireSeconds;
		this.prefix=prefix;
	}
	public int expireSeconds() {
		return expireSeconds;
	}

	public String getPrefix() {
		String className = getClass().getSimpleName();
		return className+":" + prefix+"-";
	}

}



