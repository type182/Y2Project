package com.Mai.pojo.Mybatis;

import java.util.Date;

public class Items {
    private Integer id;

    private String orderno;

    private Integer goodsid;

    private Integer userid;

    private Date ordertime;

    private Date arrivaltime;

    private Integer ordernowstatus;

    private Integer addressid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
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

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public Integer getOrdernowstatus() {
        return ordernowstatus;
    }

    public void setOrdernowstatus(Integer ordernowstatus) {
        this.ordernowstatus = ordernowstatus;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }
}