package com.sunway.webcore.entity;

import com.sunway.webbase.BaseEntity;

public class CoreTest extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2948935551350051105L;

	private String code;

	/**
	 *
	 *
	 * @mbg.generated Tue Jul 31 08:47:57 CST 2018
	 */
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	@Override
	public String toString() {
		return "CoreTest [code=" + code + ", name=" + name + "]";
	}
}
