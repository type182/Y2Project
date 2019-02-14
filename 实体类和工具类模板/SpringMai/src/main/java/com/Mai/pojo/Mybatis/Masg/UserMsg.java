package com.Mai.pojo.Mybatis.Masg;

import com.Mai.pojo.Mybatis.User;

public class UserMsg extends User {
	String msg,AppContent,HTML;
	//  错误消息机制    消息简介内容    附加HTML内容
	/**
	 * 
	 * @param msg  错误消息代码
	 * @param appContent 错误内容介绍
	 * @param hTML 错误附加HTML内容
	 */
	public UserMsg(String msg, String appContent,String hTML) {
		this.msg = msg;
		AppContent = appContent;
		HTML = hTML;
	}
	public UserMsg() {
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAppContent() {
		return AppContent;
	}
	public void setAppContent(String appContent) {
		AppContent = appContent;
	}
	public String getHTML() {
		return HTML;
	}
	public void setHTML(String hTML) {
		HTML = hTML;
	}
	
}
