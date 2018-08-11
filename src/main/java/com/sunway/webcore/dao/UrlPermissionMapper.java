package com.sunway.webcore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sunway.webcore.dto.CoreUrlPermissionDto;

/**
 * 角色权限信息 Mapper
 *
 * @author ken
 * @since  2017/2/26.
 */
@Mapper
public interface UrlPermissionMapper {

    List<CoreUrlPermissionDto> selectAll();
}
