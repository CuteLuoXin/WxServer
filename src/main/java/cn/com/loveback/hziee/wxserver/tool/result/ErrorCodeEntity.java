package cn.com.loveback.hziee.wxserver.tool.result;


import cn.com.loveback.hziee.wxserver.tool.date.DateUtil;

public class ErrorCodeEntity {
	private int code;
	private String msg;
	private String serverTime;


	public static ErrorCodeEntity SERVER_ERROR = new ErrorCodeEntity(500100, "服务端异常", DateUtil.getDate());
	public static ErrorCodeEntity CODE_ERROR = new ErrorCodeEntity(500101, "验证码错误", DateUtil.getDate());
	private ErrorCodeEntity(int code,String msg,String serverTime) {
		this.code=code;
		this.msg=msg;
		this.serverTime=serverTime;
	} 
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	public ErrorCodeEntity fillArgs(Object... args) {
		int code = this.code;
		String message = String.format(this.msg, args);
		return new ErrorCodeEntity(code, message,DateUtil.getDate());
	}
	public String getServerTime() {
		return serverTime;
	}
	
}
