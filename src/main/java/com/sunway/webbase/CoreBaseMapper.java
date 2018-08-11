package com.sunway.webbase;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author Kiuyam
 */
public interface CoreBaseMapper<T extends BaseEntity> extends Mapper<T>, IdListMapper<T, String>, InsertListMapper<T> {

}
