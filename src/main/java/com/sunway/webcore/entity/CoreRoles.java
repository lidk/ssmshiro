package com.sunway.webcore.entity;

import com.sunway.webbase.BaseEntity;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class CoreRoles extends BaseEntity {


    /**
	 * 
	 */
	private static final long serialVersionUID = 7974441217202337589L;

	/**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    private String desc;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    private String urlPrefix;

    /**
     * This method returns the value of the database column core_roles.ID
     *
     * @return the value of core_roles.ID
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public CoreRoles withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column core_roles.ID
     *
     * @param id the value for core_roles.ID
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method returns the value of the database column core_roles.NAME
     *
     * @return the value of core_roles.NAME
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public CoreRoles withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column core_roles.NAME
     *
     * @param name the value for core_roles.NAME
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column core_roles.DESC
     *
     * @return the value of core_roles.DESC
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public CoreRoles withDesc(String desc) {
        this.setDesc(desc);
        return this;
    }

    /**
     * This method sets the value of the database column core_roles.DESC
     *
     * @param desc the value for core_roles.DESC
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method returns the value of the database column core_roles.URL_PREFIX
     *
     * @return the value of core_roles.URL_PREFIX
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public String getUrlPrefix() {
        return urlPrefix;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public CoreRoles withUrlPrefix(String urlPrefix) {
        this.setUrlPrefix(urlPrefix);
        return this;
    }

    /**
     * This method sets the value of the database column core_roles.URL_PREFIX
     *
     * @param urlPrefix the value for core_roles.URL_PREFIX
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    public void setUrlPrefix(String urlPrefix) {
        this.urlPrefix = urlPrefix == null ? null : urlPrefix.trim();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", desc=").append(desc);
        sb.append(", urlPrefix=").append(urlPrefix);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
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
        CoreRoles other = (CoreRoles) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getUrlPrefix() == null ? other.getUrlPrefix() == null : this.getUrlPrefix().equals(other.getUrlPrefix()));
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:25 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getUrlPrefix() == null) ? 0 : getUrlPrefix().hashCode());
        return result;
    }
}