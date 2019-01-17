package com.Customer.Service;

public class Items {
	public String name;
	public String title;
	public String sdk;
	public String getSdk() {
		return sdk;
	}
	public void setSdk(String sdk) {
		this.sdk = sdk;
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
	public Items() {
	}
	public Items(String name, String title,String sdk) {
		this.name = name;
		this.title = title;
		this.sdk = sdk;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
