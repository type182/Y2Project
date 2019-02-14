package com.pojo.commter;

import com.pojo.User;

public class UserRegisterPage extends User{
	String coderPhon;   //手机验证码
	String emliURL;   //邮箱的URL
	String uuid;      //Hash 列队id
	String coderString;  // 验证码的值
	public String getCoderPhon() {
		return coderPhon;
	}
	public void setCoderPhon(String coderPhon) {
		this.coderPhon = coderPhon;
	}
	public String getEmliURL() {
		return emliURL;
	}
	public void setEmliURL(String emliURL) {
		this.emliURL = emliURL;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCoderString() {
		return coderString;
	}
	public void setCoderString(String coderString) {
		this.coderString = coderString;
	}
	
	public User getUser(){
		return (User)this;
	}
}
