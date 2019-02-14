package com.Mai.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/public")
public class IndexController {
	
	@RequestMapping("/index")
	/**
	 *  发往首页的代理列车
	 *  	附加到首页必要读取的公开属性 
	 */
	public String DuIndex(Model mode) {
		mode.addAttribute("geographical", "徐州");
		
		
		
		
		
		
		return "index";
	}
	
	
	
	
	
}
