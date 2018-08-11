package com.sunway.webcore.service;

import java.util.List;
import com.sunway.webcore.entity.CorePermission;


public interface ICorePermissionService {
	
	
	  public List<CorePermission> getPermissionsByUserid(String id);
	  
	  
	  public List<CorePermission> testSelect();
}
