package com.sunway.webcore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sunway.webcore.dto.CoreRolePermissionDto;

@Mapper
public interface UserPermissionMapper {
	/**
     * 获取指定 userID 对应用户拥有的角色
     * @param userID 用户ID
     * @return 返回 userID 指定用户的角色
     */
    List<CoreRolePermissionDto> selectUserRole(String userID);
}
