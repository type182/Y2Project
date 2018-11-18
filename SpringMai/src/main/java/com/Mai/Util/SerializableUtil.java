package com.Mai.Util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableUtil {
	public SerializableUtil() {
    }
 
	/**
	 * 
	 * @param object  准备序列化的对象
	 * @return 返回序列化后的数组
	 */
	public static String SerializableEncode(Object object){
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		String str=null;
        try {
    	   ObjectOutputStream objOut = new ObjectOutputStream(byteOut);  
           objOut.writeObject(object);  
           str = byteOut.toString("ISO-8859-1");//此处只能是ISO-8859-1,但是不会影响中文使用
		} catch (Exception e) {
			// TODO: handle exception
		}
        return str;
	}
	/**
	 * 
	 * @param bytes 序列化后的byte数组
	 * @return 反序列化后的值
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