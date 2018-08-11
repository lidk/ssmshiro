package com.sunway.webcore.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunway.webbase.BaseResult;
import com.sunway.webbase.BaseServiceImpl;
import com.sunway.webcore.dto.CoreUserInfoDto;
import com.sunway.webcore.entity.CoreUser;
import com.sunway.webcore.exception.BaseException;
import com.sunway.webcore.exception.data.ExceptionDataList;
import com.sunway.webcore.mapper.CoreUserMapper;
import com.sunway.webcore.service.ICoreUserInfoService;
import com.sunway.webcore.utils.ArrayListConvert;

@Service
public class CoreUserInfoService extends BaseServiceImpl<CoreUser>
		implements ICoreUserInfoService {

	@Autowired
	CoreUserMapper coreUserMapper;
	
	@Override
	public CoreUser getCoreUserByUsername(CoreUser user) {
		// TODO Auto-generated method stub
		return coreUserMapper.selectOne(user);
	}
}
