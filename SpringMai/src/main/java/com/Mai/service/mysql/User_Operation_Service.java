package com.Mai.service.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Mai.dao.Mybatis.UserMapper;
import com.Mai.pojo.Mybatis.User;

@Service
@Transactional
public class User_Operation_Service {
	
	@Autowired
	UserMapper mapper ;
	
	
	
	public User Loder(String name,String pawss) {
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
}
