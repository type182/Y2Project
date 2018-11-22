package com.Mai.pojo.Mybatis;

import java.util.Date;

public class Goods {
    private Integer id;

    private String itemname;

    private Double itempice;

    private Integer goodsShopId;

    private Date goodsUploadTime;

    private Integer goodsBrand;

    private Integer goodsType;

    private String goodsDetailed;

    private Boolean goodsSetTheRecommended;

    private String goodsResources;

    private Integer goodsState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Double getItempice() {
        return itempice;
    }

    public void setItempice(Double itempice) {
        this.itempice = itempice;
    }

    public Integer getGoodsShopId() {
        return goodsShopId;
    }

    public void setGoodsShopId(Integer goodsShopId) {
        this.goodsShopId = goodsShopId;
    }

    public Date getGoodsUploadTime() {
        return goodsUploadTime;
    }

    public void setGoodsUploadTime(Date goodsUploadTime) {
        this.goodsUploadTime = goodsUploadTime;
    }

    public Integer getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(Integer goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsDetailed() {
        return goodsDetailed;
    }

    public void setGoodsDetailed(String goodsDetailed) {
        this.goodsDetailed = goodsDetailed == null ? null : goodsDetailed.trim();
    }

    public Boolean getGoodsSetTheRecommended() {
        return goodsSetTheRecommended;
    }

    public void setGoodsSetTheRecommended(Boolean goodsSetTheRecommended) {
        this.goodsSetTheRecommended = goodsSetTheRecommended;
    }

    public String getGoodsResources() {
        return goodsResources;
    }

    public void setGoodsResources(String goodsResources) {
        this.goodsResources = goodsResources == null ? null : goodsResources.trim();
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }
}