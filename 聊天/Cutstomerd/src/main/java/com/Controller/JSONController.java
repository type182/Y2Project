package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDao;

@RestController
@RequestMapping("/JSON")
public class JSONController {
	@Autowired
	CustomerDao dao;
	
	
	@RequestMapping("/CustomerGetid")
	public Object CustomerGetId(String sdk){
		return dao.CutstomerId(sdk);
	}
	
	
	
	
	
	@RequestMapping("/userGetid")
	public Object userGetid(Integer sdk){
		return dao.userGetid(sdk);
	}
	
	
}
