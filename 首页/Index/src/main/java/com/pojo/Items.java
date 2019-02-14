package com.pojo;

import java.util.Date;

public class Items {
    private Integer id;

    private String orderNo;

    private Integer orderGoodsid;

    private Integer orderUserId;

    private Date orderTime;

    private Date orderArrivalTime;

    private Integer orderNowStatus;

    private Integer orderReceivingAddressId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getOrderGoodsid() {
        return orderGoodsid;
    }

    public void setOrderGoodsid(Integer orderGoodsid) {
        this.orderGoodsid = orderGoodsid;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderArrivalTime() {
        return orderArrivalTime;
    }

    public void setOrderArrivalTime(Date orderArrivalTime) {
        this.orderArrivalTime = orderArrivalTime;
    }

    public Integer getOrderNowStatus() {
        return orderNowStatus;
    }

    public void setOrderNowStatus(Integer orderNowStatus) {
        this.orderNowStatus = orderNowStatus;
    }

    public Integer getOrderReceivingAddressId() {
        return orderReceivingAddressId;
    }

    public void setOrderReceivingAddressId(Integer orderReceivingAddressId) {
        this.orderReceivingAddressId = orderReceivingAddressId;
    }
}