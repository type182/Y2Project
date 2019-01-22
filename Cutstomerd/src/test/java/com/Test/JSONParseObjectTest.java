package com.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Socket.pojo.CustomerMessage;
import com.alibaba.fastjson.JSON;
class fanlsit{
	String sdk;

	public String getSdk() {
		return sdk;
	}

	public void setSdk(String sdk) {
		this.sdk = sdk;
	}
	
	
	
}
public class JSONParseObjectTest {

	@Test
	public void Parsetest() {
		String sdk,usdk,message;
		CustomerMessage parseObject = 
				
				
	JSON.parseObject("{sdk:\"CKJAHNANALKJSLKJAWD\",usdk:\"\",message:\"\"}",CustomerMessage.class);
		
		System.out.println(parseObject.getSdk()+"\t"+parseObject.getMessage());
		
	}

}
