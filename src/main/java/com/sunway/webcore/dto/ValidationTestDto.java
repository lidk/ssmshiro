package com.sunway.webcore.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class ValidationTestDto {
	
	
	@NotEmpty(message = "testId不能为空")
	private String testId;

	
	@NotNull(message = "testCode号不能为空")
	private String testCode;

	public String getTestid() {
		return testId;
	}

	public void setTestid(String testId) {
		this.testId = testId;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	@Override
	public String toString() {
		return "ValidationTestDto [testId=" + testId + ", testCode=" + testCode + "]2";
	}
}
