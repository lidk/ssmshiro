package com.sunway.webbase;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface BaseService<T extends BaseEntity> {

	/**
	 * 根据实体属性作为条件进行删除，查询条件使用等号
	 * 
	 * @param <T>
	 *            record
	 * @return BaseResult
	 */
	public BaseResult delete(T record);

	/**
	 * 根据主键字段进行删除
	 * 
	 * @param string
	 *            key
	 * @return BaseResult
	 */
	public BaseResult delete(String key);

	/**
	 * 依据主键批量删除
	 * 
	 * @param List<String>
	 *            idList
	 * @return BaseResult
	 */
	public BaseResult deleteList(List<String> idList);

	/**
	 * 查询表的全部数据
	 * 
	 * @return BaseResult
	 */
	public BaseResult selectAll();

	/**
	 * 根据实体中的属性值进行查询，查询条件使用等号
	 * 
	 * @param Entity
	 *            record
	 * @return BaseResult
	 */
	public BaseResult select(T record);

	/**
	 * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
	 * 
	 * @param String
	 *            key
	 * @return BaseResult
	 */
	public BaseResult select(String key);

	/**
	 * 根据主键字段进行查询
	 * 
	 * @param List<String>
	 *            idList
	 * @return BaseResult
	 */
	public BaseResult select(List<String> idList);

	/**
	 * 根据主键字段进行查询
	 * 
	 * @param Entity
	 *            record
	 * @return BaseResult
	 */
	public BaseResult count(T record);

	/**
	 * 根据主键更新实体全部字段，null值会被更新 tag为true 更新 record中null tag为false 不更新record中null
	 * 
	 * @param Entity
	 *            record
	 * @param tag
	 * @return BaseResult
	 */
	public BaseResult update(T record, Boolean upnull);

	/**
	 * isdefault=true 保存一个实体，null的属性不会保存，会使用数据库默认值 isdefault=false
	 * 保存一个实体，null的属性也会保存，不会使用数据库默认值
	 * 
	 * @param record
	 * @param isdefault
	 * @return
	 */
	public BaseResult insert(T record, Boolean isdefault);

	/**
	 * 根据实体属性作为条件进行删除，查询条件使用等号
	 * 
	 * @param <T>
	 *            record
	 * @return BaseResult
	 */
	@Transactional
	public BaseResult transdelete(T record);

	/**
	 * 根据主键字段进行删除
	 * 
	 * @param string
	 *            key
	 * @return BaseResult
	 */
	@Transactional
	public BaseResult transdelete(String key);

	/**
	 * 依据主键批量删除
	 * 
	 * @param List<String>
	 *            idList
	 * @return BaseResult
	 */
	@Transactional
	public BaseResult transdeleteList(List<String> idList);

	/**
	 * 根据主键更新实体全部字段，null值会被更新 tag为true 更新 record中null tag为false 不更新record中null
	 * 
	 * @param Entity
	 *            record
	 * @param tag
	 * @return BaseResult
	 */
	@Transactional
	public BaseResult transupdate(T record, Boolean upnull);

	/**
	 * isdefault=true 保存一个实体，null的属性不会保存，会使用数据库默认值 isdefault=false
	 * 保存一个实体，null的属性也会保存，不会使用数据库默认值
	 * 
	 * @param record
	 * @param isdefault
	 * @return
	 */
	@Transactional
	public BaseResult transinsert(T record, Boolean isdefault);

	/**
	 * 
	 * @param pagenum
	 * @param limitnum
	 * @param orderBy
	 * @return
	 */
	public BaseResult selectpage(int pagenum, int limitnum, String orderBy);

	/**
	 * 
	 * @param Entity
	 *            record
	 * @param pagenum
	 *            页码
	 * @param limitnum
	 *            每页行数
	 * @return BaseResult
	 */
	public BaseResult selectpage(T record, int pagenum, int limitnum, String orderBy);

	/**
	 * 根据实体中的属性值进行查询，查询条件使用等号,不进行分页只是按分页数据格式返回相关信息
	 * 
	 * @param Entity
	 *            record
	 * @return BaseResult
	 */
	public BaseResult selectpage(T record);

	/**
	 * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号,不进行分页只是按分页数据格式返回相关信息
	 * 
	 * @param String
	 *            key
	 * @return BaseResult
	 */
	public BaseResult selectpage(String key);

	/**
	 * 根据主键字段进行查询,不进行分页只是按分页数据格式返回相关信息
	 * 
	 * @param List<String>
	 *            idList
	 * @return BaseResult
	 */
	public BaseResult selectpage(List<String> idList);

	public BaseResult insert(List<T> listecord);

	public BaseResult transinsert(List<T> listecord);

	String ReturnClassName();

}
