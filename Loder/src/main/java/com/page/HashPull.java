package com.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//Hash列队
public class HashPull {
	private HashMap map16 = new HashMap();
	
	private HashMap map32 = new HashMap();
	
	private HashMap map8 = new HashMap();
	private static HashPull hashPull = new HashPull();
	
	private HashPull(){}
	
	public HashPull getInstean(){
		return hashPull;
	}
	public Object get(Object key){
		int hashCode = key.hashCode();
		if (hashCode%32==0) {
			return map32.get(key);
		}
		else if (hashCode%16==0) {
			return map16.get(key);
		}
		else if (hashCode%8==0) {
			return map8.get(key);
		}
		return null;
	}
	
	
	public HashPull put(Object key,Object value){
		
		int hashCode = key.hashCode();
		if (hashCode%32==0) {
			map32.put(key, value);
		}
		else if (hashCode%16==0) {
			map16.put(key, value);
		}
		else if (hashCode%8==0) {
			map8.put(key, value);
		}
		return this;
		
	}
	
	
	
	
	
	
}
