package com.Lucene;

public class LucentPojo {
	String id;
	String name;
	String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LucentPojo(String id, String name, String content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
	}
	public LucentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
