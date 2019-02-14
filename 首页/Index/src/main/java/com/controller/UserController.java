package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Service.UserService;



@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	UserService user;
	
	
	//用户登陆
	
	@RequestMapping("/Loder")
	public String Loder(HttpSession session,
			String username,
			String userpass,
			Integer type,
			String url
			){
		
		boolean userLode = user.UserLode(session, username, userpass, type);
		if (userLode) {
			return "redirect:"+url;
		}else{
			return "redirect:toloder";
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	//邮箱地址跳转
	@RequestMapping("/toseelp")
	public String toSeelp(Model model){
		String em = "2839795585@qq.com";
		if (em.indexOf("@qq.com")!=-1) {
			model.addAttribute("url", "https://mail.qq.com/cgi-bin/loginpage");
		}else if (em.indexOf("@163.com")!=-1) {
			model.addAttribute("url", "https://mail.163.com/");
		}
		
		
		
		return "Seelp";
	}
}
