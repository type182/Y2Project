package com.Mai.pojo.Redis;
/**
 * 
 * @author 聊天记录
 *
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Record implements Serializable{
	Integer userid;  //用户id
	
	Integer itemsuid;  //商家客服的id
	Date day;    //聊天的时间
	List<String> list= new ArrayList<String>(); //聊天的内容
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getItemsuid() {
		return itemsuid;
	}
	public void setItemsuid(Integer itemsuid) {
		this.itemsuid = itemsuid;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	public Record() {
	}
	public Record(Integer userid, Integer itemsuid, Date day, List<String> list) {
		this.userid = userid;
		this.itemsuid = itemsuid;
		this.day = day;
		this.list = list;
	}
	
	
	
	
}
