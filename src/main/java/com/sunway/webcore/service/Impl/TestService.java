package com.sunway.webcore.service.Impl;

import org.springframework.stereotype.Service;

import com.sunway.webcore.service.ITestService;


@Service
public class TestService implements ITestService {

	@Override
	public void Test() {
		System.out.println("11111");
	}
}
