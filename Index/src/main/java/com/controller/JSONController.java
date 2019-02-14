package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/JSON")
public class JSONController {
	@RequestMapping("/Items.JSON")
	public Object Items(HttpSession session){
		if (session.getAttribute("User")==null) {
			return null;
		}else{
			return null;
		}
	}
}
