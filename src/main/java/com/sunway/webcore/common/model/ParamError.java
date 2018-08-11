package com.sunway.webcore.common.model;

import java.io.Serializable;

public class ParamError implements Serializable{

	// System.out.println("getCode--" + error.getCode()); getCode--NotEmpty
	// System.out.println("getDefaultMessage--" + error.getDefaultMessage());
	// getDefaultMessage--testId不能为空
	// System.out.println("getField--" + error.getField()); getField--testId
	// System.out.println("getObjectName--" + error.getObjectName());
	// getObjectName--validationTestDto

	/**
	 * 
	 */
	private static final long serialVersionUID = -4097140266859675066L;

	private String code;

	private String defaultMessage;

	private String field;

	private String dtoName;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getDtoName() {
		return dtoName;
	}

	public void setDtoName(String dtoName) {
		this.dtoName = dtoName;
	}

	@Override
	public String toString() {
		return "ParamsError [code=" + code + ", defaultMessage=" + defaultMessage + ", field=" + field + ", dtoName="
				+ dtoName + "]";
	}
}
