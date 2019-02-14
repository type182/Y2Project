package com.Customer.Cli;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import com.Customer.Customer.Customer;
import com.Customer.pojo.CustomerPojo;
import com.Socket.pojo.CustomerMessage;
import com.alibaba.fastjson.JSON;

@ServerEndpoint(value = "/Cli")
@Component
public class CliSocket {
	
	
	//当前客户的Session 
	public static Map<String,Session> map  =new HashMap<String,Session>();
	
	@OnOpen
	public void OnOpen(Session session) throws IOException{
		System.out.println("调试输出 客服Session集合:\t\n");
		System.err.println("\n"+map+"\n--------------------------------------------------");
		session.getBasicRemote().sendText("{\"sdk\":\""+map.keySet().iterator().next()+"\",\"usdk\":\"\",\"message\":\"\"}");
		
	}
	
	@OnError
	public void OnError(Session session,Throwable throwable){
		throwable.printStackTrace();
	}
	
	@OnClose
	public void OnClose(Session session){
		//当用户退出时执行删除当前用户的Session
		System.err.println("用户退出:"+session);
		for (String key : Customer.SessionMap.keySet()) {
			if(Customer.SessionMap.get(key).equals(session)){
				Customer.SessionMap.remove(key);
				
				break;
			}
		}
	}
	
	@OnMessage
	public void OnMessage(Session session,String message) throws IOException{
		CustomerMessage parseArray = JSON.parseObject(message,  CustomerMessage.class);
		if (parseArray.getSdk()==null || parseArray.getSdk().equals("")) {
			Customer.SessionMap.put(parseArray.getUsdk(), session);
		}else{
			Session session2 = map.get(parseArray.getSdk());
			session2.getBasicRemote().sendText(message);
		}
	}
	
		
	
	
	
}
