package com.Mai.pojo.Redis;
/**
 * 
 * @author 购物车
 *
 */

import java.io.Serializable;
import java.util.Date;

public final class Shopping implements Serializable {
	Date shoppingDate;  //加入购物车的时间
	Integer goodsid;    //商品的id
	Integer userid;     //用户的id
	public Date getShoppingDate() {
		return shoppingDate;
	}
	public void setShoppingDate(Date shoppingDate) {
		this.shoppingDate = shoppingDate;
	}
	public Integer getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Shopping(Date shoppingDate, Integer goodsid, Integer userid) {
		this.shoppingDate = shoppingDate;
		this.goodsid = goodsid;
		this.userid = userid;
	}
	public Shopping() {
	}
	
	
	
	
	
}
