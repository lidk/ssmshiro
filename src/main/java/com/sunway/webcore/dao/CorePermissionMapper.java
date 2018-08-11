package com.sunway.webcore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sunway.webcore.entity.CorePermission;
import com.sunway.webcore.entity.CoreUser;


public interface CorePermissionMapper {
   
    
    public List<CorePermission> getPermissionsByUserid(String id);
    
    
    public List<CorePermission> testSelect();
}