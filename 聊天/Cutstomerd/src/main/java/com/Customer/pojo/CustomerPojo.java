package com.Customer.pojo;

import java.util.HashMap;
import java.util.Map;

import javax.websocket.Session;

public class CustomerPojo {
	public int businessId;
	public Map<String, Session> map = new HashMap<String, Session>();
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public Map<String, Session> getMap() {
		return map;
	}
	public void setMap(Map<String, Session> map) {
		this.map = map;
	}
	
}
