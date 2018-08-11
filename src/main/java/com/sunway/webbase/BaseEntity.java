package com.sunway.webbase;

import java.io.Serializable;
import javax.persistence.*;

import com.sunway.webbase.genid.UUIdGenId;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.annotation.Version;

/**
 * @author Kiuyam
 */

public abstract class BaseEntity implements Serializable {

	/**
	 * 序列化UID
	 */
	private static final long serialVersionUID = 6931838002290514422L;
	
	@Id
	@KeySql(genId = UUIdGenId.class)
	protected String id;
	
	
	//乐观锁
	@Version
	private long version;
	//跟踪设计


	public long getVersion() {
		return version;
	}


	public void setVersion(long version) {
		this.version = version;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}
	
	//BaseAduitEntity  插入时间   创建者
}
