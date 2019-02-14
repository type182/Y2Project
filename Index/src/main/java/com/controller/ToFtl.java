package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToFtl {
	//注册页面
	@RequestMapping("/toregister")
	public static String toRegister(Model model){return "register";}
		
	//登陆页面
	@RequestMapping("/toloder")
	public static String toLoder(Model model){return "UserLoder";}
	//首页
	@RequestMapping("/index")
	public static String toIndex(Model model){return "tosindex";}
//	@RequestMapping("/toloder")
//	public String toLoder(Model model){return "UserLoder";}
		
}
