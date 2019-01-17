package com.Service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dao.UserMapper;
import com.pojo.User;

@Service
public class UserService {
	@Autowired
	UserMapper user;
	
	
	
	
	public boolean UserLode(HttpSession session,String username,String userpawss,Integer type){
		User userLoder = user.UserLoder(username, userpawss, type);
		if (userLoder==null || userLoder.getId()<0) {
			//登陆失败
			return false;
		}else{
			//登陆成功
			session.setAttribute("user", user);
			return true;
		}
	}
	
	
	
}
