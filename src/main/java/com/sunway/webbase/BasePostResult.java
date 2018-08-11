package com.sunway.webbase;

import java.io.Serializable;

public class BasePostResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1312507860144678826L;

	private boolean success;

	private String message;

	private Object data;

	private Integer code;

	public BasePostResult() {
	}

	public BasePostResult(boolean success) {
		this(success, null, null, 0);
	}

	public BasePostResult(boolean success, String message) {
		this(success, message, null, 0);
	}

	public BasePostResult(boolean success, String message, Object data) {
		this.success = success;
		this.message = message;
		this.data = data;
		this.code = 0;
	}

	public BasePostResult(boolean success, String message, Object data, Integer code) {
		this.success = success;
		this.message = message;
		this.data = data;
		this.code = code;
		if (this.message == null) {
			this.message = "";
		}
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "BasePostResult [success=" + success + ", message=" + message + ", data=" + data + ", code=" + code
				+ "]";
	}
}
