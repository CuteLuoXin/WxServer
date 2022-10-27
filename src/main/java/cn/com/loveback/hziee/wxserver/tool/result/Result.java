package cn.com.loveback.hziee.wxserver.tool.result;


import cn.com.loveback.hziee.wxserver.tool.date.DateUtil;

public class Result<T> {
	
	private int code;
	private String msg;
	private String serverTime;
	private T data;
	/*
	 *构造函数
	 * */
	private Result(T date) {
		this.data=date;
		this.serverTime= DateUtil.getDate();
		this.msg="";
	}
	/**
	 *  成功时候的调用
	 * */
	public static  <T> Result<T> success(T data){
		return new Result<T>(data);
	}
	
	/**
	 *  失败时候的调用
	 * */
	public static  <T> Result<T> error(ErrorCodeEntity codey){
		return new Result<T>(codey);
	}
	
	
	private Result(int code, String msg,String serviceTime) {
		this.code = code;
		this.msg = msg;
		this.serverTime=serviceTime;
	}
	
	private Result(ErrorCodeEntity codey) {
		if(codey != null) {
			this.code = codey.getCode();
			this.msg = codey.getMsg();
			this.serverTime=codey.getServerTime();
		}
	}
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getServerTime() {
		return serverTime;
	}
	public void setServerTime(String serverTime) {
		this.serverTime = serverTime;
	}
	
}
