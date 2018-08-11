package com.sunway.webcore.exception;

import com.sunway.webcore.exception.data.ExceptionData;

public class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8307494007775482491L;

	private Integer code;

	private String LogMes;
	
	public BaseException() {
		super();
	}

	public BaseException(Integer code, String msg) {
		super(msg);
		this.code = code;
		this.LogMes = "";
	}

	public BaseException(Integer code, String msg, String log) {
		super(msg);
		this.code = code;
		this.LogMes = log;
	}

	public BaseException(ExceptionData ex) {
		super(ex.getMsg());
		this.code = ex.getCode();
		this.LogMes = "";
	}

	public BaseException(ExceptionData ex, String log) {
		super(ex.getMsg());
		this.code = ex.getCode();
		this.LogMes = log;
	}

	/**
	 * 
	 * @param code
	 * @param msg
	 * @param cause
	 */
	public BaseException(Integer code, String msg, Throwable cause) {
		super(msg, cause);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLogMes() {
		return LogMes;
	}

	public void setLogMes(String logMes) {
		LogMes = logMes;
	}

	@Override
	public String toString() {
		return "BaseException [code=" + code + ", LogMes=" + LogMes + "]";
	}

}
