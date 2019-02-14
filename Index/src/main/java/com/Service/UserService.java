package com.Service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Util.ProportionPojo;
import com.Util.ProportionScatter;
import com.dao.UserMapper;
import com.pojo.User;

@Service
public class UserService {
	@Autowired
	UserMapper user;
	
	@Autowired
	ProportionScatter proportionScatter;
	
	
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
	
	/*
	
	public List<goods> GetUserList(Integer index, HttpServletRequest request, User isNotUser){
		List<ProportionPojo> proPorTion = proportionScatter.getProPorTion(request, isNotUser);
		List<goods> listdatasource = new ArrayList<goods>();
		for (ProportionPojo pro : proPorTion) {
			List<goods> list = user.getAll(pro);
			listdatasource.addAll(list);
		}
		
		return listdatasource;
	}*/
	
	
}
