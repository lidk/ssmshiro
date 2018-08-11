package com.sunway.webcore.exception.data;

import java.io.Serializable;

public class ExceptionData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6122122676498424901L;

	private int code;
	
	private String msg;
	
	public ExceptionData(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
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
}
