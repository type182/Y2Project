package com.Customer.Customer;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.Customer.Service.CustomerLoderService;
import com.Customer.Service.Items;
import com.Socket.pojo.CustomerMessage;
import com.Socket.pojo.CustomerPojo;
import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
@ServerEndpoint("/Customer")
public class Customer {
	public static final String SKD = "QWERTRYUIOPASDFGHJKLZXCVBNMqwertyupasdfghjklzxcvbnm";
	public Map<String, CustomerPojo> map = new HashMap<String, CustomerPojo>();
	@OnOpen
	public void OnOpen(Session session) throws IOException{
		//客服链接管理
		//生成客户端的id
		Date date = new Date();
		//回发给客户端
		long time = date.getTime();
		int size= (int) (time%10000);
		//客服id生产
		StringBuffer buffer = new StringBuffer(size);
		for (int i = 0; i < Math.random()*20; i++) {
			char count=SKD.charAt( (int) (Math.random()*SKD.length()));
			buffer.append(count);
		}
		
		
		session.getBasicRemote().sendText(buffer.toString());
		map.get(buffer.toString()).setMap(new HashMap<Session, Map<String,Session>>(){
			{
				if (this.size()<5) {
					put(session, new HashMap<String, Session>());
				}
			}
		});
		
		System.out.println("Session Id:"+session.getId()+"\t链接成功 ~~~");
	}
	@OnMessage 
	public void OnMessage(Session session,String message) throws IOException{
		/*
		 * ｛SDK:"",USDK:"",message:""｝
		 */
		CustomerMessage messagecust = JSON.parseObject(message, CustomerMessage.class);
		CustomerPojo customerPojo = map.get(messagecust.getSdk());
		//获取客户的商家对象
		Map<Session, Map<String, Session>> Custom_Cli = customerPojo.getMap();
		//获取整个商家下面的客服
		Map<String, Session> map2 = Custom_Cli.get(session);
		if (map2==null || map2.keySet().size()<1) {
			Custom_Cli.put(session, new HashMap<String, Session>());
			map.get(messagecust.getSdk()).setMap(Custom_Cli);
		}else{
			if (messagecust.getUsdk()==null || messagecust.getUsdk().equals("")) {
				//没有发送消息的
			}else{
				map2.get(messagecust.getUsdk()).getBasicRemote().sendText(messagecust.getSdk());
			}
		}
	}
	
	
	
	
	
}
