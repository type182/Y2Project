package com.Mai.controller.user;

import javax.servlet.http.*;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Mai.HTML.UserHTML;
import com.Mai.Util.EmilUtil;
import com.Mai.Util.SerializableUtil;
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
	//回到用户注册
	@RequestMapping("/UserLode.html")
	public String toUserLode(Model model) {
		if (!model.containsAttribute("msg")) {
			model.addAttribute("msg",new UserMsg("0 OK", "欢迎MaiMai登陆", ""));
		}
		return "/User/UserLode";
	}
	
	
	//回到首页
	@RequestMapping("/index.html")
	public String toIndex(Model model) { return "index";}
	
	@RequestMapping("/register.html")
	public String ToregisterEmail() {
		return "/User/register" ;
	}
	
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
	
	
	
	
	
	
	
	
	
	/**
	 *   手机号注册
	 * @param session  
	 * @param model
	 * @param abstract1  注册前的用户
	 * @return  
	 * @throws Exception 
	 */
	@RequestMapping("/register")
	public String Register(HttpSession session,Model model , UserAbstract abstract1) throws Exception {
		Integer type = abstract1.getType();
		
		if (type==2) {
			String Code = "<h1 style=\"color:red;\">恭喜你在MaiMai网注册成功!:<a href=\"http://www.maimai.com/User/usermail?username="+abstract1.getUsername()+"&type=2&email="+abstract1.getEmail()+"&userPwd="+abstract1.getUserPwd()+"\">点击注册</a></h1>";
			try {
				EmilUtil.SendMail(abstract1.getEmail(), Code);
			} catch (Exception e) {
				e.printStackTrace();
			}
			model.addAttribute("searuser", abstract1);
			return "User/seelp";
		}else {
			abstract1.setThisuser(true);
			User getUser = abstract1.GetUser();
			if (getUser instanceof UserMsg) {
				model.addAttribute("Err", getUser);
				return "opt/abs/Err";
			}else {
				return userservic(session,model,abstract1);
			}
		}
		
		
	}
	
	
	
	/**
	 * 用户的邮箱注册
	 * @param session
	 * @param code
	 * @return   回到首页进行
	 * @throws Exception 
	 */
	@RequestMapping("/usermail")
	public String UserMail(HttpSession session,Model model, UserAbstract abstract1) throws Exception {
		
		return userservic(session,model,abstract1);
	}
	
	public String userservic(HttpSession session,Model model,UserAbstract abstract1) throws Exception {
		User getUser = abstract1.GetUser();
		
		if(service.UserRegister(getUser)) {
			getUser = service.Loder(getUser.getUser_name(), getUser.getUser_pwd());
			session.setAttribute("user", getUser);
		}else {
			abstract1.setType(15);
			model.addAttribute("Err", abstract1.GetUser());
			return "opt/abs/Err";
		}
		return "index";
	}
	
	
	
	
	
	
}
