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
public class CoreOperationRecord extends BaseEntity {
    /**
     *
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    private String recordId;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    private Integer userId;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    private String userName;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    private Date time;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    private String result;

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column core_operation_record.ID
     *
     * @return the value of core_operation_record.ID
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public CoreOperationRecord withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column core_operation_record.ID
     *
     * @param id the value for core_operation_record.ID
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method returns the value of the database column core_operation_record.RECORD_ID
     *
     * @return the value of core_operation_record.RECORD_ID
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public CoreOperationRecord withRecordId(String recordId) {
        this.setRecordId(recordId);
        return this;
    }

    /**
     * This method sets the value of the database column core_operation_record.RECORD_ID
     *
     * @param recordId the value for core_operation_record.RECORD_ID
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    /**
     * This method returns the value of the database column core_operation_record.USER_ID
     *
     * @return the value of core_operation_record.USER_ID
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public CoreOperationRecord withUserId(Integer userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method sets the value of the database column core_operation_record.USER_ID
     *
     * @param userId the value for core_operation_record.USER_ID
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column core_operation_record.USER_NAME
     *
     * @return the value of core_operation_record.USER_NAME
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public CoreOperationRecord withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    /**
     * This method sets the value of the database column core_operation_record.USER_NAME
     *
     * @param userName the value for core_operation_record.USER_NAME
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method returns the value of the database column core_operation_record.NAME
     *
     * @return the value of core_operation_record.NAME
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public CoreOperationRecord withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column core_operation_record.NAME
     *
     * @param name the value for core_operation_record.NAME
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column core_operation_record.TIME
     *
     * @return the value of core_operation_record.TIME
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public Date getTime() {
        return time;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public CoreOperationRecord withTime(Date time) {
        this.setTime(time);
        return this;
    }

    /**
     * This method sets the value of the database column core_operation_record.TIME
     *
     * @param time the value for core_operation_record.TIME
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method returns the value of the database column core_operation_record.RESULT
     *
     * @return the value of core_operation_record.RESULT
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public String getResult() {
        return result;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public CoreOperationRecord withResult(String result) {
        this.setResult(result);
        return this;
    }

    /**
     * This method sets the value of the database column core_operation_record.RESULT
     *
     * @param result the value for core_operation_record.RESULT
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", recordId=").append(recordId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", name=").append(name);
        sb.append(", time=").append(time);
        sb.append(", result=").append(result);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
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
        CoreOperationRecord other = (CoreOperationRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()));
    }

    /**
     *
     * @mbg.generated Tue Jul 31 10:18:13 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        return result;
    }
}