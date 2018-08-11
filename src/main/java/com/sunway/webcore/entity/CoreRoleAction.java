package com.sunway.webcore.entity;

import com.sunway.webbase.BaseEntity;

/**
 * Created By MBG-GUI-EXTENSION
 * https://github.com/spawpaw/mybatis-generator-gui-extension Description:
 * 
 *
 * @author
 */
public class CoreRoleAction extends BaseEntity {

	/**
	 *
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	private String actionId;

	/**
	 *
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	private String roleId;

	/**
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method returns the value of the database column core_role_action.ID
	 *
	 * @return the value of core_role_action.ID
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public String getId() {
		return id;
	}

	/**
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public CoreRoleAction withId(String id) {
		this.setId(id);
		return this;
	}

	/**
	 * This method sets the value of the database column core_role_action.ID
	 *
	 * @param id
	 *            the value for core_role_action.ID
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method returns the value of the database column
	 * core_role_action.ACTION_ID
	 *
	 * @return the value of core_role_action.ACTION_ID
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public String getActionId() {
		return actionId;
	}

	/**
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public CoreRoleAction withActionId(String actionId) {
		this.setActionId(actionId);
		return this;
	}

	/**
	 * This method sets the value of the database column
	 * core_role_action.ACTION_ID
	 *
	 * @param actionId
	 *            the value for core_role_action.ACTION_ID
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public void setActionId(String actionId) {
		this.actionId = actionId == null ? null : actionId.trim();
	}

	/**
	 * This method returns the value of the database column
	 * core_role_action.ROLE_ID
	 *
	 * @return the value of core_role_action.ROLE_ID
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public CoreRoleAction withRoleId(String roleId) {
		this.setRoleId(roleId);
		return this;
	}

	/**
	 * This method sets the value of the database column
	 * core_role_action.ROLE_ID
	 *
	 * @param roleId
	 *            the value for core_role_action.ROLE_ID
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId == null ? null : roleId.trim();
	}

	/**
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", actionId=").append(actionId);
		sb.append(", roleId=").append(roleId);
		sb.append("]");
		return sb.toString();
	}

	/**
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		CoreRoleAction other = (CoreRoleAction) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getActionId() == null ? other.getActionId() == null
						: this.getActionId().equals(other.getActionId()))
				&& (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
	}

	/**
	 *
	 * @mbg.generated Tue Jul 31 10:19:43 CST 2018
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getActionId() == null) ? 0 : getActionId().hashCode());
		result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
		return result;
	}
}