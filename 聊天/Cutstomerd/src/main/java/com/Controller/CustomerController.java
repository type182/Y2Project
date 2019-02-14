package com.Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Customer.Customer.Customer;
import com.Service.CutstomerService;
import com.pojo.GoodsItemsUser;
import com.pojo.cutstomer;
import com.pojo.User;
@Controller
@RequestMapping("/Customer")
public class CustomerController {
	@Autowired
	CutstomerService service;
	
	
	
	@RequestMapping("/Loder")
	public String Loder(Model model,String sdk,String pawss){
		cutstomer it = service.CuststomerLoder(sdk, pawss);
		if(it == null){
			model.addAttribute("message", "登陆失败请查看你的SDK/登陆密码");
			model.addAttribute("sdk", sdk).addAttribute("pawss", pawss);
			return "index";
		}
		//客服登陆。。。。
		model.addAttribute("it", it);
		return "Customer/Customer";
	}
	
	
	
	@RequestMapping("/UserLode")
	public String UserLoder(HttpSession session){
		 User user = new User(1, "Type", "147258", "18261487135", "", "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2970475210,1192698497&fm=27&gp=0.jpg", 0);
		session.setAttribute("user",user);
		return "User/userSocket";
	}
	
}
