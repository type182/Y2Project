package com.Customer.Customer;

import java.util.HashMap;
import java.util.Map;

import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/Click")
public class Click {
	public static Map<String,Session> map = new HashMap<String,Session>();
	
}
