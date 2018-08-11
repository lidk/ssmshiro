package com.sunway.webcore.exception;

import java.io.Serializable;
import java.util.List;

import com.sunway.webcore.common.model.ParamError;

public class BaseBindException implements Serializable{

	private static final long serialVersionUID = -7013289272935242931L;

	private int count;
	
	private List<ParamError> params;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<ParamError> getParams() {
		return params;
	}

	public void setParams(List<ParamError> params) {
		this.params = params;
	}
	
	@Override
	public String toString() {
		return "BaseBindException [count=" + count + ", params=" + params + "]";
	}

}
