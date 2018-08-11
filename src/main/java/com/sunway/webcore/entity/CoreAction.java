package com.sunway.webcore.entity;

import com.sunway.webbase.BaseEntity;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class CoreAction extends BaseEntity{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2969986553986703534L;

	/**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    private String desc;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    private String param;

    /**
     * This method returns the value of the database column core_action.ID
     *
     * @return the value of core_action.ID
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public CoreAction withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column core_action.ID
     *
     * @param id the value for core_action.ID
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method returns the value of the database column core_action.NAME
     *
     * @return the value of core_action.NAME
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public CoreAction withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column core_action.NAME
     *
     * @param name the value for core_action.NAME
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method returns the value of the database column core_action.DESC
     *
     * @return the value of core_action.DESC
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public CoreAction withDesc(String desc) {
        this.setDesc(desc);
        return this;
    }

    /**
     * This method sets the value of the database column core_action.DESC
     *
     * @param desc the value for core_action.DESC
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method returns the value of the database column core_action.PARAM
     *
     * @return the value of core_action.PARAM
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public String getParam() {
        return param;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public CoreAction withParam(String param) {
        this.setParam(param);
        return this;
    }

    /**
     * This method sets the value of the database column core_action.PARAM
     *
     * @param param the value for core_action.PARAM
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
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
        sb.append(", param=").append(param);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
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
        CoreAction other = (CoreAction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getParam() == null ? other.getParam() == null : this.getParam().equals(other.getParam()));
    }

    /**
     *
     * @mbg.generated Tue Jul 31 09:45:36 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getParam() == null) ? 0 : getParam().hashCode());
        return result;
    }
}