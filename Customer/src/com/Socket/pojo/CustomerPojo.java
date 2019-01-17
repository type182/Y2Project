package com.Socket.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.Session;

public class CustomerPojo {
	
	private Map<Session, Map<String,Session>> map = new HashMap<Session, Map<String,Session>>();
	/**
	 *    Session 客服
	 *    	Map 用户 Session
	 */
	
	String key;
	String name;
	String title;
	public Map<Session, Map<String, Session>> getMap() {
		return map;
	}
	public void setMap(Map<Session, Map<String, Session>> map) {
		this.map = map;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
