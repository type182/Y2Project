package com.Mai.service.mysql.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Mai.HTML.UserHTML;
import com.Mai.dao.Mybatis.UserMapper;
import com.Mai.pojo.Mybatis.User;
import com.Mai.pojo.Mybatis.Masg.UserMsg;

@Service
@Transactional
public class UserOpService {
	
	@Autowired
	UserMapper mapper ;
	
	
	
	public User Loder(String name,String pawss) throws Exception {
		User user = mapper.UserLoder(name, pawss);
		return user;
	}
	
	
	
	
	
	
	
	
}
