package com.sunway.webbase;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import com.sunway.webcore.exception.BaseException;

public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

	@Autowired
	private CoreBaseMapper<T> mapper;

	private Class<T> entityClass;

	private String entityName;

	public CoreBaseMapper<T> getMapper() {
		return mapper;
	}

	
	
	@SuppressWarnings("unchecked")
	public BaseServiceImpl() {
		entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		entityName = entityClass.getName();
	}

	@Override
	public String ReturnClassName() {
		return entityClass.getName();
	}

	/**
	 * 根据实体属性作为条件进行删除，查询条件使用等号
	 * 
	 * @param <T>
	 *            record
	 * @return BaseResult
	 */
	@Override
	public BaseResult delete(T record) {
		BaseResult result = new BaseResult();
		try {
			List<T> s = mapper.select(record);
			if (s != null && !s.isEmpty()) {
				int i = mapper.delete(record);
				if (i < 1) {
					result = BaseInfo.errorDeleteResult;
				} else {
					result = BaseInfo.succesDeleteResult;
				}
			} else {
				result = BaseInfo.errorDeleteResult;
				result.setData(BaseInfo.errorParameter);
			}
		} catch (Exception e) {
			result = BaseInfo.errorDeleteResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据主键字段进行删除
	 * 
	 * @param string
	 *            key
	 * @return BaseResult
	 */
	@Override
	public BaseResult delete(String key) {
		BaseResult result = new BaseResult();
		try {
			T s = mapper.selectByPrimaryKey(key);
			if (s != null) {
				int i = mapper.deleteByPrimaryKey(key);
				if (i < 1) {
					result = BaseInfo.errorDeleteResult;
				} else {
					result = BaseInfo.succesDeleteResult;
				}
			} else {
				result = BaseInfo.errorDeleteResult;
				result.setData(BaseInfo.errorParameter);
			}
		} catch (Exception e) {
			// TODO: handle exception
			result = BaseInfo.errorDeleteResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 依据主键批量删除
	 * 
	 * @param List<String>
	 *            idList
	 * @return BaseResult
	 */
	@Override
	public BaseResult deleteList(List<String> idList) {
		BaseResult result = new BaseResult();

		try {
			List<T> s = mapper.selectByIdList(idList);
			if (s != null && (s.isEmpty() || (s.size() != idList.size()))) {
				int i = mapper.deleteByIdList(idList);
				if (i < 1) {
					result = BaseInfo.errorDeleteResult;
				} else {
					result = BaseInfo.succesDeleteResult;
				}
			} else {
				result = BaseInfo.errorDeleteResult;
				result.setData(BaseInfo.errorParameter);
			}
		} catch (Exception e) {
			result = BaseInfo.errorDeleteResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}

		return result;
	}

	/**
	 * 查询表的全部数据
	 * 
	 * @return BaseResult
	 */
	@Override
	public BaseResult selectAll() {
		BaseResult result = new BaseResult();
		try {
			List<T> s = mapper.selectAll();
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据实体中的属性值进行查询，查询条件使用等号
	 * 
	 * @param Entity
	 *            record
	 * @return BaseResult
	 */
	@Override
	public BaseResult select(T record) {
		BaseResult result = new BaseResult();
		try {
			List<T> s = mapper.select(record);
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
	 * 
	 * @param String
	 *            key
	 * @return BaseResult
	 */
	@Override
	public BaseResult select(String key) {
		BaseResult result = new BaseResult();
		try {
			T h = mapper.selectByPrimaryKey(key);
			List<T> s = new ArrayList<T>();
			s.add(h);
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据主键字段进行查询
	 * 
	 * @param List<String>
	 *            idList
	 * @return BaseResult
	 */
	@Override
	public BaseResult select(List<String> idList) {
		BaseResult result = new BaseResult();

		try {
			List<T> s = mapper.selectByIdList(idList);
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}

		return result;
	}

	/**
	 * 根据主键字段进行查询
	 * 
	 * @param Entity
	 *            record
	 * @return BaseResult
	 */
	@Override
	public BaseResult count(T record) {
		BaseResult result = new BaseResult();
		try {
			int s = mapper.selectCount(record);
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据主键更新实体全部字段，null值会被更新 tag为true 更新 record中null tag为false 不更新record中null
	 * 
	 * @param Entity
	 *            record
	 * @param tag
	 * @return BaseResult
	 */
	@Override
	public BaseResult update(T record, Boolean upnull) {
		BaseResult result = new BaseResult();
		try {
			List<T> s = mapper.select(record);
			int i = 0;
			if (s != null && !s.isEmpty()) {
				if (upnull) {
					i = mapper.updateByPrimaryKey(record);
				} else {
					i = mapper.updateByPrimaryKeySelective(record);
				}

				if (i < 1) {
					result = BaseInfo.errorUpdateResult;
				} else {
					result = BaseInfo.successUpdateResult;
				}
			} else {
				result = BaseInfo.errorUpdateResult;
				result.setData(BaseInfo.errorParameter);
			}
		} catch (Exception e) {
			result = BaseInfo.errorUpdateResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * isdefault=true 保存一个实体，null的属性不会保存，会使用数据库默认值 isdefault=false
	 * 保存一个实体，null的属性也会保存，不会使用数据库默认值 ,ID 已经强制赋值为null 传啥都不管用
	 * 
	 * @param record
	 * @param isdefault
	 * @return
	 */
	@Override
	public BaseResult insert(T record, Boolean isdefault) {
		BaseResult result = new BaseResult();
		try {
			int i = 0;
			record.id = null;
			if (isdefault) {
				i = mapper.insertSelective(record);
			} else {
				i = mapper.insert(record);
			}
			if (i < 1) {
				result = BaseInfo.errorInsertResult;
			} else {
				result = BaseInfo.successInsertResult;
				result.setData(record);
			}

		} catch (Exception e) {
			result = BaseInfo.errorInsertResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	@Override
	public BaseResult insert(List<T> listecord) {
		BaseResult result = new BaseResult();
		try {
			int i = 0;
			for (T t : listecord) {
				t.id = null;
			}
			i = mapper.insertList(listecord);
			if (i < 1) {
				result = BaseInfo.errorInsertResult;
			} else {
				result = BaseInfo.successInsertResult;
				result.setData(listecord);
			}

		} catch (Exception e) {
			result = BaseInfo.errorInsertResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据实体属性作为条件进行删除，查询条件使用等号
	 * 
	 * @param <T>
	 *            record
	 * @return BaseResult
	 */
	@Override
	@Transactional
	public BaseResult transdelete(T record) {
		BaseResult result = new BaseResult();
		try {
			List<T> s = mapper.select(record);
			if (s != null && !s.isEmpty()) {
				int i = mapper.delete(record);
				if (i < 1) {
					result = BaseInfo.errorDeleteResult;
				} else {
					result = BaseInfo.succesDeleteResult;
				}
			} else {
				result = BaseInfo.errorDeleteResult;
				result.setData(BaseInfo.errorParameter);
			}
		} catch (Exception e) {
			result = BaseInfo.errorDeleteResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据主键字段进行删除
	 * 
	 * @param string
	 *            key
	 * @return BaseResult
	 */
	@Override
	@Transactional
	public BaseResult transdelete(String key) {
		BaseResult result = new BaseResult();
		try {
			T s = mapper.selectByPrimaryKey(key);
			if (s != null) {
				int i = mapper.deleteByPrimaryKey(key);
				if (i < 1) {
					result = BaseInfo.errorDeleteResult;
				} else {
					result = BaseInfo.succesDeleteResult;
				}
			} else {
				result = BaseInfo.errorDeleteResult;
				result.setData(BaseInfo.errorParameter);
			}
		} catch (Exception e) {
			// TODO: handle exception
			result = BaseInfo.errorDeleteResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 依据主键批量删除
	 * 
	 * @param List<String>
	 *            idList
	 * @return BaseResult
	 */
	@Override
	@Transactional
	public BaseResult transdeleteList(List<String> idList) {
		BaseResult result = new BaseResult();

		try {
			List<T> s = mapper.selectByIdList(idList);
			if (s != null && (s.isEmpty() || (s.size() != idList.size()))) {
				int i = mapper.deleteByIdList(idList);
				if (i < 1) {
					result = BaseInfo.errorDeleteResult;
				} else {
					result = BaseInfo.succesDeleteResult;
				}
			} else {
				result = BaseInfo.errorDeleteResult;
				result.setData(BaseInfo.errorParameter);
			}
		} catch (Exception e) {
			result = BaseInfo.errorDeleteResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}

		return result;
	}

	/**
	 * 根据主键更新实体全部字段，null值会被更新 tag为true 更新 record中null tag为false 不更新record中null
	 * 
	 * @param Entity
	 *            record
	 * @param tag
	 * @return BaseResult
	 */
	@Override
	@Transactional
	public BaseResult transupdate(T record, Boolean upnull) {
		BaseResult result = new BaseResult();
		try {
			List<T> s = mapper.select(record);
			int i = 0;
			if (s != null && !s.isEmpty()) {
				if (upnull) {
					i = mapper.updateByPrimaryKey(record);
				} else {
					i = mapper.updateByPrimaryKeySelective(record);
				}

				if (i < 1) {
					result = BaseInfo.errorUpdateResult;
				} else {
					result = BaseInfo.successUpdateResult;
				}
			} else {
				result = BaseInfo.errorUpdateResult;
				result.setData(BaseInfo.errorParameter);
			}
		} catch (Exception e) {
			result = BaseInfo.errorUpdateResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * isdefault=true 保存一个实体，null的属性不会保存，会使用数据库默认值 isdefault=false
	 * 保存一个实体，null的属性也会保存，不会使用数据库默认值 ，ID 已经强制赋值为null 传啥都不管用
	 * 
	 * @param record
	 * @param isdefault
	 * @return
	 */
	@Override
	@Transactional
	public BaseResult transinsert(T record, Boolean isdefault) {
		BaseResult result = new BaseResult();
		try {
			int i = 0;
			record.id = null;
			if (isdefault) {
				i = mapper.insertSelective(record);
			} else {
				i = mapper.insert(record);
			}
			if (i < 1) {
				result = BaseInfo.errorInsertResult;
			} else {
				result = BaseInfo.successInsertResult;
				result.setData(record);
			}

		} catch (Exception e) {
			result = BaseInfo.errorInsertResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	@Override
	@Transactional
	public BaseResult transinsert(List<T> listecord) {
		BaseResult result = new BaseResult();
		try {
			int i = 0;
			for (T t : listecord) {
				t.id = null;
			}
			i = mapper.insertList(listecord);
			if (i < 1) {
				result = BaseInfo.errorInsertResult;
			} else {
				result = BaseInfo.successInsertResult;
				result.setData(listecord);
			}

		} catch (Exception e) {
			result = BaseInfo.errorInsertResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 查询表的全部数据,分页查询
	 * 
	 * @return BaseResult
	 */
	@Override
	public BaseResult selectpage(int pagenum, int limitnum, String orderBy) {
		BaseResult result = new BaseResult();
		try {
			PageMethod.startPage(pagenum, limitnum);
			if (orderBy != null && orderBy.length() != 0) {
				PageMethod.orderBy(orderBy);
			}
			List<T> d = mapper.selectAll();
			PageInfo<T> pageinfo = new PageInfo<T>(d);
			BasePageData s = new BasePageData(d, pagenum, limitnum, pageinfo.getTotal(), pageinfo.getPages());
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		} finally {
			PageMethod.clearPage();
		}
		return result;
	}

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
	@Override
	public BaseResult selectpage(T record, int pagenum, int limitnum, String orderBy) {
		BaseResult result = new BaseResult();
		try {
			PageMethod.startPage(pagenum, limitnum);
			if (orderBy != null && orderBy.length() != 0) {
				PageMethod.orderBy(orderBy);
			}
			List<T> d = mapper.select(record);
			PageInfo<T> pageinfo = new PageInfo<T>(d);
			BasePageData s = new BasePageData(d, pagenum, limitnum, pageinfo.getTotal(), pageinfo.getPages());
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		} finally {
			PageMethod.clearPage();
		}
		return result;
	}

	/**
	 * 根据实体中的属性值进行查询，查询条件使用等号,不进行分页只是按分页数据格式返回相关信息
	 * 
	 * @param Entity
	 *            record
	 * @return BaseResult
	 */
	@Override
	public BaseResult selectpage(T record) {
		BaseResult result = new BaseResult();
		try {
			List<T> d = mapper.select(record);
			BasePageData s = new BasePageData(d, 1, d.size(), d.size(), 1);
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号,不进行分页只是按分页数据格式返回相关信息
	 * 
	 * @param String
	 *            key
	 * @return BaseResult
	 */
	@Override
	public BaseResult selectpage(String key) {
		BaseResult result = new BaseResult();
		try {
			T h = mapper.selectByPrimaryKey(key);
			List<T> d = new ArrayList<T>();
			d.add(h);
			BasePageData s = new BasePageData(d, 1, d.size(), d.size(), 1);
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}
		return result;
	}

	/**
	 * 根据主键字段进行查询,不进行分页只是按分页数据格式返回相关信息
	 * 
	 * @param List<String>
	 *            idList
	 * @return BaseResult
	 */
	@Override
	public BaseResult selectpage(List<String> idList) {
		BaseResult result = new BaseResult();
		try {
			List<T> d = mapper.selectByIdList(idList);
			BasePageData s = new BasePageData(d, d.size(), 1, d.size(), 1);
			result = BaseInfo.successSelectResult;
			result.setData(s);
		} catch (Exception e) {
			result = BaseInfo.errorSelectResult;
			result.setData(BaseInfo.errorDataBase);
			BaseException ex = new BaseException(805, e.getMessage(), entityName + "--服务器出现错误");
			throw ex;
		}

		return result;
	}

	// 按条件查询 删除 添加 更新 exmaple

}
