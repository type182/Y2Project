package com.Mai.controller.user;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Mai.pojo.Mybatis.User;
import com.Mai.pojo.Mybatis.Masg.UserMsg;
import com.Mai.pojo.Mybatis.abstracts.UserAbstract;
import com.Mai.service.mysql.User_Operation_Service;
/**
 * 
 * @author 用户操作的控制器1
 * 			修改资料部分
 * 		用户的登陆
 * 		用户的注册
 * 		用户的修改密码
 *		用户的充值
 *		用户的修改个人资料
 *		用户的头像上传
 *		
 */
@Controller
@RequestMapping("/User")
public class User_Operation {
	@Autowired
	User_Operation_Service service;
	
	
	/**
	 * 用户的登陆
	 * @param username 用户名/邮箱/手机号
	 * @param userpaw 密码
	 * @return
	 */
	@RequestMapping("/loder")
	public String Loder(Model model,String username,String userpaw) {
		return "index";
	}
	
	@RequestMapping("/register")
	public String Register(HttpSession session,UserAbstract abstract1) {
		User getUser = abstract1.GetUser();
		if (getUser instanceof UserMsg) {
			session.setAttribute("Err", getUser);
			return "/opt/abs/Err";
		}else {
			session.setAttribute("User", getUser);
			
			// Service     方法
			
			
			
			return "index";
		}
	}
	
	
	
	
	
	
	
}
