package com.sunway.webcore.entity;

import java.util.Date;

import com.sunway.webbase.BaseEntity;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class CoreAccessRecord extends BaseEntity{

    /**
	 * 
	 */
	private static final long serialVersionUID = 103506614742161693L;

	/**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    private String userId;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    private String userName;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    private String accessType;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    private Date accessTime;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    private String accessIp;

    /**
     * This method returns the value of the database column core_access_record.ID
     *
     * @return the value of core_access_record.ID
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public CoreAccessRecord withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column core_access_record.ID
     *
     * @param id the value for core_access_record.ID
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method returns the value of the database column core_access_record.USER_ID
     *
     * @return the value of core_access_record.USER_ID
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public CoreAccessRecord withUserId(String userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method sets the value of the database column core_access_record.USER_ID
     *
     * @param userId the value for core_access_record.USER_ID
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method returns the value of the database column core_access_record.USER_NAME
     *
     * @return the value of core_access_record.USER_NAME
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public CoreAccessRecord withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    /**
     * This method sets the value of the database column core_access_record.USER_NAME
     *
     * @param userName the value for core_access_record.USER_NAME
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method returns the value of the database column core_access_record.ACCESS_TYPE
     *
     * @return the value of core_access_record.ACCESS_TYPE
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public CoreAccessRecord withAccessType(String accessType) {
        this.setAccessType(accessType);
        return this;
    }

    /**
     * This method sets the value of the database column core_access_record.ACCESS_TYPE
     *
     * @param accessType the value for core_access_record.ACCESS_TYPE
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }

    /**
     * This method returns the value of the database column core_access_record.ACCESS_TIME
     *
     * @return the value of core_access_record.ACCESS_TIME
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public Date getAccessTime() {
        return accessTime;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public CoreAccessRecord withAccessTime(Date accessTime) {
        this.setAccessTime(accessTime);
        return this;
    }

    /**
     * This method sets the value of the database column core_access_record.ACCESS_TIME
     *
     * @param accessTime the value for core_access_record.ACCESS_TIME
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * This method returns the value of the database column core_access_record.ACCESS_IP
     *
     * @return the value of core_access_record.ACCESS_IP
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public String getAccessIp() {
        return accessIp;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public CoreAccessRecord withAccessIp(String accessIp) {
        this.setAccessIp(accessIp);
        return this;
    }

    /**
     * This method sets the value of the database column core_access_record.ACCESS_IP
     *
     * @param accessIp the value for core_access_record.ACCESS_IP
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp == null ? null : accessIp.trim();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", accessType=").append(accessType);
        sb.append(", accessTime=").append(accessTime);
        sb.append(", accessIp=").append(accessIp);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
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
        CoreAccessRecord other = (CoreAccessRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getAccessType() == null ? other.getAccessType() == null : this.getAccessType().equals(other.getAccessType()))
            && (this.getAccessTime() == null ? other.getAccessTime() == null : this.getAccessTime().equals(other.getAccessTime()))
            && (this.getAccessIp() == null ? other.getAccessIp() == null : this.getAccessIp().equals(other.getAccessIp()));
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:42 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getAccessType() == null) ? 0 : getAccessType().hashCode());
        result = prime * result + ((getAccessTime() == null) ? 0 : getAccessTime().hashCode());
        result = prime * result + ((getAccessIp() == null) ? 0 : getAccessIp().hashCode());
        return result;
    }
}