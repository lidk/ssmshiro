package com.sunway.webcore.dto;

import java.util.Date;

public class CoreAccessRecordDto {
	/**
	 * 登入登出记录ID 仅当该记录从数据库取出时有效
	 */
	private String id;

	/**
	 * 登陆用户ID
	 */
	private String userID;

	/**
	 * 登陆用户名
	 */
	private String userName;

	/**
	 * 记录类型，登入或登出
	 */
	private String accessType;

	/**
	 * 登入或登出时间
	 */
	private Date accessTime;

	/**
	 * 用户登入或登出对应的IP地址
	 */
	private String accessIP;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getAccessType() {
		return accessType;
	}


	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}


	public Date getAccessTime() {
		return accessTime;
	}


	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}


	public String getAccessIP() {
		return accessIP;
	}


	public void setAccessIP(String accessIP) {
		this.accessIP = accessIP;
	}


	@Override
	public String toString() {
		return "CoreAccessRecordDto [id=" + id + ", userID=" + userID + ", userName=" + userName + ", accessType="
				+ accessType + ", accessTime=" + accessTime + ", accessIP=" + accessIP + "]";
	}
}
