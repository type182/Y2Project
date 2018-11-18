package com.Mai.service.mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Mai.dao.Mybatis.TestMapper;
import com.Mai.pojo.Mybatis.User;
@Service
@Transactional()
public class TestService {
	@Autowired
	TestMapper mapper;
	
	public List<User> GetAll() throws Exception{
		return mapper.GetAll();
	}
	
}
