package com.Mai.Util;
import com.Mai.Util.Phon.ModelMsg;

/**
 * 发送验证码
 * 网易云信地址：http://dev.netease.im/
 * @author Administrator
 *
 */
public class PhonUtil {
	
	public static void main(String[] args) {
		boolean sendPhon = SendPhon("18261487135", "15967");
		if (sendPhon) {
			System.out.println("OK");
		}
	}
	
		public static boolean SendPhon(String phon,String key) {
			try {
	        	String str = ModelMsg.sendMsg(phon,key);
	            if("success".equals(str)){
	            	return true;
	            }else{
	            	return false;
	            }
	        } catch (Exception e) {
	            return false;
	        }
		}
}
