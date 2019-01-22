package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsItemsUser {
	
	String name,images;
	int size,id;
	public GoodsItemsUser() {
	}
	public GoodsItemsUser(String name, String images, int size, int id,
			List<String> list) {
		this.name = name;
		this.images = images;
		this.size = size;
		this.id = id;
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	List<String> list= new ArrayList<String>();
	
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
