package com.ssm.service.impl;

import org.springframework.stereotype.Service;

import com.ssm.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Override
	public String test() {
		return "test";
	}

}
