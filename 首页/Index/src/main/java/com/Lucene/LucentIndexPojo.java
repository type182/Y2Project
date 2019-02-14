package com.Lucene;

import org.apache.lucene.document.Field.Store;

public class LucentIndexPojo {
	String key;
	String value;
	Store store;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public LucentIndexPojo() {
	}
	public LucentIndexPojo(String key, String value, Store store) {
		this.key = key;
		this.value = value;
		this.store = store;
	}
	
}
