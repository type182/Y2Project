package com.Mai.Util;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmilUtil {
	public static void SendMail(String Mail,String code) throws Exception {
		Authenticator authenticator = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("Admin@Type.com", "147258");
			}
		};
		Properties props = new Properties();
//		props.setProperty("", "");
//		props.setProperty("", "");
//		props.setProperty("", "");
		Session session = Session.getInstance(props , authenticator);
		Message message = new MimeMessage(session);
		
		Address add = new InternetAddress("Admin@Type.com");
		message.setFrom(add);
		
		message.setRecipient(RecipientType.TO, new InternetAddress(Mail));
		
		message.setSubject("来自MaiMai网的用户注册激活邮件");
		
		message.setContent("<h1>激活吗?<a href='http://192.168.151.101/Tom/serven?code='>"+"http://192.168.151.101/Tom/serven?code="+code+"</a></h1>","text/html; charset=UTF-8");
		
		
		Transport.send(message);
	}
}
