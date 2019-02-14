package com.Mai.controller.Util;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Mai.Util.SerializableUtil;
import com.Mai.pojo.Mybatis.User;

@Controller
@RequestMapping("/mail")
public class MailPage {

	@RequestMapping("/usermail")
	public String UserMail(HttpSession session,String code) {
		User user = (User) SerializableUtil.SerializableDecode(code);
		session.setAttribute("user", user);
		return "index";
	}
	
	
}
