package com.Customer.Customer;
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

import com.Customer.Cli.CliSocket;
import com.Customer.pojo.CustomerPojo;
import com.Socket.pojo.CustomerMessage;
import com.alibaba.fastjson.JSON;

@ServerEndpoint(value = "/Customer")
@Component
public class Customer {
	public static Map<String,Session> SessionMap = new HashMap<String, Session>();
	//用户的Session
	
	@OnOpen
	public void OnOpen(Session session) throws IOException{
		System.out.println("调试输出 用户Session集合:\t\n");
		System.err.println("\n"+SessionMap+"\n--------------------------------------------------");
		
		
	}
	@OnMessage 
	public void OnMessage(Session session,String message) throws IOException{
		System.out.println("客服: Id:"+session.getId()+"\t"+message);
		CustomerMessage messagecust = JSON.parseObject(message, CustomerMessage.class);
		if (messagecust.getUsdk()==null || messagecust.getUsdk().equals("")) {
			CliSocket.map.put(messagecust.getSdk(),session);
		}else{
			Session uSession = SessionMap.get(messagecust.getUsdk());
			uSession.getBasicRemote().sendText(message);
		}
		System.out.println("调试输出 用户Session集合:\t\n");
		System.err.println("\n"+SessionMap+"\n--------------------------------------------------");
		
	}
	
	@OnClose
	public void OnClose(Session session){
		for (String key : CliSocket.map.keySet()) {
			if (CliSocket.map.get(key).equals(session)) {
				CliSocket.map.remove(key);
				break;
			}
		}
	}
	
	@OnError
	public void OnError(Session session,Throwable throwable) throws IOException{
		System.out.println(session.getId()+"   ");
		throwable.printStackTrace();
	}
	
}
