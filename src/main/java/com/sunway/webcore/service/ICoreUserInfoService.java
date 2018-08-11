package com.sunway.webcore.service;

import java.util.List;

import com.sunway.webbase.BaseResult;
import com.sunway.webbase.BaseService;
import com.sunway.webcore.dto.CoreUserInfoDto;
import com.sunway.webcore.entity.CoreUser;
import com.sunway.webcore.exception.BaseException;

public interface ICoreUserInfoService extends  BaseService<CoreUser>{

	public CoreUser getCoreUserByUsername(CoreUser user);
	
}
