package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.annotation.Log;
import com.ssm.entity.Person;
import com.ssm.mapper.PersonMapper;
import com.ssm.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonMapper personMapper;

	@Override
	public int insert(Person person) {
		return personMapper.insertSelective(person);
	}
	
}
