package com.Mai.pojo.Mybatis;

import java.util.Date;

public class Goods {
    private Integer id;

    private String itemname;

    private Double itempice;

    private Integer shopid;

    private Date goodsuptim;

    private Integer goodstype;

    private Integer state;

    private Float popularity;

    private String titleimage;

    private String goodsbrand;

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

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Date getGoodsuptim() {
        return goodsuptim;
    }

    public void setGoodsuptim(Date goodsuptim) {
        this.goodsuptim = goodsuptim;
    }

    public Integer getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Integer goodstype) {
        this.goodstype = goodstype;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Float getPopularity() {
        return popularity;
    }

    public void setPopularity(Float popularity) {
        this.popularity = popularity;
    }

    public String getTitleimage() {
        return titleimage;
    }

    public void setTitleimage(String titleimage) {
        this.titleimage = titleimage == null ? null : titleimage.trim();
    }

    public String getGoodsbrand() {
        return goodsbrand;
    }

    public void setGoodsbrand(String goodsbrand) {
        this.goodsbrand = goodsbrand == null ? null : goodsbrand.trim();
    }
}