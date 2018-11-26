package com.Mai.pojo.Mybatis.abstracts;

import com.Mai.HTML.UserHTML;
import com.Mai.Util.abnormal.UserAbnormal;
import com.Mai.pojo.Mybatis.User;
import com.Mai.pojo.Mybatis.Masg.UserMsg;
/**
 * 
 * @author 用户注册的辅助类
 *
 */
public class UserAbstract {
	 protected String userprotected; 
	 protected String username;//用户名
	 protected String userPwd;  //用户密码
	 private Integer type;  // 注册类型的标识: 1 手机注册 2 邮箱注册
	 private boolean thisuser=false; //是否注册成功
	 private String Userver; // 用户的验证码
	public String getUserver() {
		return Userver;
	}

	public void setUserver(String userver) {
		Userver = userver;
	}

	public boolean isThisuser() {
		return thisuser;
	}

	public void setThisuser(boolean thisuser) {
		this.thisuser = thisuser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUserprotected() {
		return userprotected;
	}

	public void setUserprotected(String userprotected) {
		this.userprotected = userprotected;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	 
	public User GetUser(){
		User user = null;
		if (type==1) {
			user = new User(null, username, userPwd, userprotected, null, null, null);
		}else if(type == 2){
			user = new User(null, username, userPwd,null , userprotected, null, null);
		}else {
			user =new UserMsg(UserAbnormal.LANDING_RESULT_IS_EMPTY, "用户注册失败 你选择类型出现了问题~~~",UserHTML.SELECT_REGISTRATION_TYPE);
		}
		return user;
	}
	 
}
