package com.sunway.webcore.dto;

public class CoreRolePermissionDto {

	private String roleid;// 角色ID
	private String roleName;// 角色名
	private String roleDesc;// 角色描述

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@Override
	public String toString() {
		return "CoreRolePermissionDto [roleid=" + roleid + ", roleName=" + roleName + ", roleDesc=" + roleDesc + "]";
	}
}
