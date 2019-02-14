package com.Redis.pojo;

import java.io.Serializable;

public class TopItems implements Serializable{
	String url;
	String imageurl;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public TopItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TopItems(String url, String imageurl) {
		super();
		this.url = url;
		this.imageurl = imageurl;
	}
	
	
}
