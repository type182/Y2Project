package com.Mai.controller.user;

import javax.servlet.http.*;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Mai.HTML.UserHTML;
import com.Mai.pojo.Mybatis.User;
import com.Mai.pojo.Mybatis.Masg.UserMsg;
import com.Mai.pojo.Mybatis.abstracts.UserAbstract;
import com.Mai.service.mysql.User.UserOpService;
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
public class UserOperation {
	@Autowired
	UserOpService service; // 用户信息的Service
	
	@RequestMapping("/UserLode.html")
	public String toUserLode(Model model) {
		if (!model.containsAttribute("msg")) {
			model.addAttribute("msg",new UserMsg("0 OK", "欢迎MaiMai登陆", ""));
		}
		return "/User/UserLode";
	}
	@RequestMapping("/index.html")
	public String toIndex(Model model) { return "index";}
	
	
	
	/**
	 * 用户的登陆 普通登陆
	 * @param username 用户名/邮箱/手机号
	 * @param userpaw 密码
	 * @return
	 */
	@RequestMapping("/loder")
	public String Loder(Model mode,HttpSession session,String username,String pawss) {
		try {
			User loder = service.Loder(username, pawss);
			session.setAttribute("user", loder);
			if (loder==null) {
				throw new Exception("用户名密码错误异常");
			}
			return "redirect:index.html";
		} catch (Exception e) {
			UserMsg user = new UserMsg("0X001", "用户登陆异常: 你登陆的用户名或者密码错误", UserHTML.SELECT_REGISTRATION_TYPE);
			mode.addAttribute("msg", user);
			e.printStackTrace();
			return toUserLode(mode);
		}
		
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
