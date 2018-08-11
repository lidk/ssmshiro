package com.sunway.webcore.entity;

import com.sunway.webbase.BaseEntity;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class CorePermission {
    /**
     *   主键
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private String id;

    /**
     *   资源名称
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private String name;

    /**
     *   资源类型：menu,button,
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private String type;

    /**
     *   访问url地址
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private String url;

    /**
     *   权限代码字符串
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private String percode;

    /**
     *   父结点id
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private Long parentid;

    /**
     *   父结点id列表串
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private String parentids;

    /**
     *   排序号
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private String sortstring;

    /**
     *   是否可用,1：可用，0不可用
     *
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private String available;

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column core_permission.id
     *
     * @return the value of core_permission.id
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.id
     *
     * @param id the value for core_permission.id
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column core_permission.name
     *
     * @return the value of core_permission.name
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.name
     *
     * @param name the value for core_permission.name
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column core_permission.type
     *
     * @return the value of core_permission.type
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withType(String type) {
        this.setType(type);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.type
     *
     * @param type the value for core_permission.type
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column core_permission.url
     *
     * @return the value of core_permission.url
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.url
     *
     * @param url the value for core_permission.url
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method returns the value of the database column core_permission.percode
     *
     * @return the value of core_permission.percode
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public String getPercode() {
        return percode;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withPercode(String percode) {
        this.setPercode(percode);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.percode
     *
     * @param percode the value for core_permission.percode
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setPercode(String percode) {
        this.percode = percode;
    }

    /**
     * This method returns the value of the database column core_permission.parentid
     *
     * @return the value of core_permission.parentid
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withParentid(Long parentid) {
        this.setParentid(parentid);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.parentid
     *
     * @param parentid the value for core_permission.parentid
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * This method returns the value of the database column core_permission.parentids
     *
     * @return the value of core_permission.parentids
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public String getParentids() {
        return parentids;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withParentids(String parentids) {
        this.setParentids(parentids);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.parentids
     *
     * @param parentids the value for core_permission.parentids
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setParentids(String parentids) {
        this.parentids = parentids;
    }

    /**
     * This method returns the value of the database column core_permission.sortstring
     *
     * @return the value of core_permission.sortstring
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public String getSortstring() {
        return sortstring;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withSortstring(String sortstring) {
        this.setSortstring(sortstring);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.sortstring
     *
     * @param sortstring the value for core_permission.sortstring
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setSortstring(String sortstring) {
        this.sortstring = sortstring;
    }

    /**
     * This method returns the value of the database column core_permission.available
     *
     * @return the value of core_permission.available
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public String getAvailable() {
        return available;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public CorePermission withAvailable(String available) {
        this.setAvailable(available);
        return this;
    }

    /**
     * This method sets the value of the database column core_permission.available
     *
     * @param available the value for core_permission.available
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append(", percode=").append(percode);
        sb.append(", parentid=").append(parentid);
        sb.append(", parentids=").append(parentids);
        sb.append(", sortstring=").append(sortstring);
        sb.append(", available=").append(available);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
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
        CorePermission other = (CorePermission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getPercode() == null ? other.getPercode() == null : this.getPercode().equals(other.getPercode()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getParentids() == null ? other.getParentids() == null : this.getParentids().equals(other.getParentids()))
            && (this.getSortstring() == null ? other.getSortstring() == null : this.getSortstring().equals(other.getSortstring()))
            && (this.getAvailable() == null ? other.getAvailable() == null : this.getAvailable().equals(other.getAvailable()));
    }

    /**
     *
     * @mbg.generated Thu Aug 09 10:38:43 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getPercode() == null) ? 0 : getPercode().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getParentids() == null) ? 0 : getParentids().hashCode());
        result = prime * result + ((getSortstring() == null) ? 0 : getSortstring().hashCode());
        result = prime * result + ((getAvailable() == null) ? 0 : getAvailable().hashCode());
        return result;
    }
}