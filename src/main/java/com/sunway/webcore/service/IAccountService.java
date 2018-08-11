package com.sunway.webcore.service;

import java.util.Map;

import com.sunway.webcore.exception.BaseException;

public interface IAccountService {

	void passwordModify(String userID, Map<String, Object> passwordInfo) throws BaseException;

}
