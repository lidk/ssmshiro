package com.sunway.webcore.exception;

import java.io.Serializable;

public class BasePostException implements Serializable {

	private static final long serialVersionUID = -1089876997779034210L;

	private Object data;

	private Integer code;

	private String LogMes;

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

	private String msg;

	private String excetion;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getExcetion() {
		return excetion;
	}

	public void setExcetion(String excetion) {
		this.excetion = excetion;
	}

	@Override
	public String toString() {
		return "BasePostException [data=" + data + ", code=" + code + ", LogMes=" + LogMes + ", msg=" + msg
				+ ", excetion=" + excetion + "]";
	}

	public String errorLog() {
		return "data=" + data + ", code=" + code + ", LogMes=" + LogMes + ", msg=" + msg + ", excetion=" + excetion;
	}
}
