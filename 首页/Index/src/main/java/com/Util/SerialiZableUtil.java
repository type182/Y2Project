package com.Util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialiZableUtil {
	public SerialiZableUtil() {
    }
 
	/**
	 * 
	 * @param object  准备序列化的对象
	 * @return 返回序列化后String类型
	 */
	public static String SerializableEncode(Object object){
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		String str=null;
        try {
    	   ObjectOutputStream objOut = new ObjectOutputStream(byteOut);  
           objOut.writeObject(object);  
           //序列化只能使用ISO-8859-1进行编码
           str = byteOut.toString("ISO-8859-1");
		} catch (Exception e) {
			e.printStackTrace();
		}
        return str;
	}
	/**
	 * 
	 * @param bytes 序列化后的byte数组
	 * @return 反序列化后的pojo类对象
	 */
    public static Object SerializableDecode(String str) {
    	 try {
    		 ByteArrayInputStream byteIn = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));  
             ObjectInputStream objIn = new ObjectInputStream(byteIn);  
             Object obj =objIn.readObject();  
             return obj;
		} catch (Exception e) {
			return null;
		}
    }
}
