package com.Mai.Util.overall;

import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Bs64 {
	/**
	 * 
	 * @param value  选择加密的字符串
	 * @return 加密后的数据 
	 * @throws IOException
	 */
	public static String Bs64Encoder(String value) throws IOException{
		
		System.out.println(value);
		BASE64Encoder encoder = new BASE64Encoder();
		String dencode = encoder.encode(value.getBytes());
		return dencode;
	}
	
	
	
	
	
	/**
	 * 
	 * 
	 * @param coder  加密后的字符串
	 * @return  加密前的值
	 */
	public static String Bs64Decoder(String coder){
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decodeBuffer=null;
		try {
			decodeBuffer = decoder.decodeBuffer(coder);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(decodeBuffer);
	}
}
