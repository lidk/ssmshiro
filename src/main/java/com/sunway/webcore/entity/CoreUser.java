package com.sunway.webcore.entity;

import com.sunway.webbase.BaseEntity;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class CoreUser extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4711759164822306074L;

	/**
     *
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    private String username;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    private String password;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    private Integer firstLogin;

    /**
     *
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    private String rolelist;

    /**
     * This method returns the value of the database column core_user.ID
     *
     * @return the value of core_user.ID
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public CoreUser withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column core_user.ID
     *
     * @param id the value for core_user.ID
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method returns the value of the database column core_user.USERNAME
     *
     * @return the value of core_user.USERNAME
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public CoreUser withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column core_user.USERNAME
     *
     * @param username the value for core_user.USERNAME
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method returns the value of the database column core_user.PASSWORD
     *
     * @return the value of core_user.PASSWORD
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public CoreUser withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column core_user.PASSWORD
     *
     * @param password the value for core_user.PASSWORD
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method returns the value of the database column core_user.FIRST_LOGIN
     *
     * @return the value of core_user.FIRST_LOGIN
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public Integer getFirstLogin() {
        return firstLogin;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public CoreUser withFirstLogin(Integer firstLogin) {
        this.setFirstLogin(firstLogin);
        return this;
    }

    /**
     * This method sets the value of the database column core_user.FIRST_LOGIN
     *
     * @param firstLogin the value for core_user.FIRST_LOGIN
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public void setFirstLogin(Integer firstLogin) {
        this.firstLogin = firstLogin;
    }

    /**
     * This method returns the value of the database column core_user.ROLELIST
     *
     * @return the value of core_user.ROLELIST
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public String getRolelist() {
        return rolelist;
    }

    /**
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public CoreUser withRolelist(String rolelist) {
        this.setRolelist(rolelist);
        return this;
    }

    /**
     * This method sets the value of the database column core_user.ROLELIST
     *
     * @param rolelist the value for core_user.ROLELIST
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    public void setRolelist(String rolelist) {
        this.rolelist = rolelist == null ? null : rolelist.trim();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", firstLogin=").append(firstLogin);
        sb.append(", rolelist=").append(rolelist);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
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
        CoreUser other = (CoreUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getFirstLogin() == null ? other.getFirstLogin() == null : this.getFirstLogin().equals(other.getFirstLogin()))
            && (this.getRolelist() == null ? other.getRolelist() == null : this.getRolelist().equals(other.getRolelist()));
    }

    /**
     *
     * @mbg.generated Tue Jul 31 08:47:57 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getFirstLogin() == null) ? 0 : getFirstLogin().hashCode());
        result = prime * result + ((getRolelist() == null) ? 0 : getRolelist().hashCode());
        return result;
    }
}