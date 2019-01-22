package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/JSP")
public class JSPController {
	@RequestMapping("/index")
	public String Index(){
		return "index";
	}
}
