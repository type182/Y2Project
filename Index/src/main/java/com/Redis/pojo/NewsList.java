package com.Redis.pojo;

import java.io.Serializable;

public class NewsList implements Serializable{
	String id;
	String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public NewsList(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public NewsList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
