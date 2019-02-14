package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.page.MapResponest;
@Controller
@RequestMapping("/Test")
public class TestController {
	@Autowired
	MapResponest rs;
	
	
	@RequestMapping("/josp")
	public void showlst(HttpServletResponse response) throws IOException{
		rs.map.put("001", response);
		PrintWriter writer = response.getWriter();
		
		writer.write("Key 001");
		writer.write("11");
	}
	
	
	@RequestMapping("/update")
	public void showlst(String key,HttpServletResponse response) throws IOException{
		HttpServletResponse httpServletResponse = rs.map.get(key);
		PrintWriter writer = httpServletResponse.getWriter();
		writer.write("To ListShow 12");
		response.getWriter().write("OK");
	}
}
