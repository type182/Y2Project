package com.Mai.pojo.Mybatis.abstracts;

import java.io.Serializable;

import com.Mai.HTML.UserHTML;
import com.Mai.Util.abnormal.UserAbnormal;
import com.Mai.pojo.Mybatis.User;
import com.Mai.pojo.Mybatis.Masg.UserMsg;
/**
 * 
 * @author 用户注册的辅助类
 *
 */
public class UserAbstract implements Serializable{
	 protected String userprotected; 
	 protected String username;//用户名
	 protected String userPwd;  //用户密码
	 private Integer type;  // 注册类型的标识: 1 手机注册 2 邮箱注册
	 private boolean thisuser=false; //是否注册成功
	 private String userver; // 用户的验证码
	 private String email; //用户的邮箱账号
	 private String phon;  //用户的手机号
	 
	 
	 
	 
	public boolean getThisuser() {
		return thisuser;
	}
	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserver() {
		return userver;
	}

	public void setUserver(String userver) {
		this.userver = userver;
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
