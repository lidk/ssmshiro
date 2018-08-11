/**
 * 
 */
package com.sunway.webcore.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunway.webcore.dao.CorePermissionMapper;
import com.sunway.webcore.entity.CorePermission;
import com.sunway.webcore.service.ICorePermissionService;

/**
 * @author 李大坤
 *
 */
@Service
public class CorePermissionService implements ICorePermissionService {

	
	@Autowired
	CorePermissionMapper corePermissionMapper;
	
	@Override
	public List<CorePermission> getPermissionsByUserid(String id) {
		System.out.println("CorePermissionServiceImpl");
		return corePermissionMapper.getPermissionsByUserid(id);
	}

	
	@Override
	public List<CorePermission> testSelect() {
		
		return corePermissionMapper.testSelect();
	}

}
