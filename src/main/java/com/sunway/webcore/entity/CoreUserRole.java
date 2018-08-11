package com.sunway.webcore.entity;

import com.sunway.webbase.BaseEntity;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class CoreUserRole extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 178059754068724822L;

	/**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    private String roleId;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    private String userId;

    /**
     * This method returns the value of the database column core_user_role.ID
     *
     * @return the value of core_user_role.ID
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public CoreUserRole withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column core_user_role.ID
     *
     * @param id the value for core_user_role.ID
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method returns the value of the database column core_user_role.ROLE_ID
     *
     * @return the value of core_user_role.ROLE_ID
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public CoreUserRole withRoleId(String roleId) {
        this.setRoleId(roleId);
        return this;
    }

    /**
     * This method sets the value of the database column core_user_role.ROLE_ID
     *
     * @param roleId the value for core_user_role.ROLE_ID
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method returns the value of the database column core_user_role.USER_ID
     *
     * @return the value of core_user_role.USER_ID
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public CoreUserRole withUserId(String userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method sets the value of the database column core_user_role.USER_ID
     *
     * @param userId the value for core_user_role.USER_ID
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
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
        CoreUserRole other = (CoreUserRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:07 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}