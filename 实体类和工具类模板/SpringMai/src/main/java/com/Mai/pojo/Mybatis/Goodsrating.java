package com.Mai.pojo.Mybatis;

import java.util.Date;

public class Goodsrating {
    private Integer id;

    private Integer goodsid;

    private Date goodsratingtime;

    private String goodsratingcontent;

    private String ratinglinks;

    private Integer goodsscore;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Date getGoodsratingtime() {
        return goodsratingtime;
    }

    public void setGoodsratingtime(Date goodsratingtime) {
        this.goodsratingtime = goodsratingtime;
    }

    public String getGoodsratingcontent() {
        return goodsratingcontent;
    }

    public void setGoodsratingcontent(String goodsratingcontent) {
        this.goodsratingcontent = goodsratingcontent == null ? null : goodsratingcontent.trim();
    }

    public String getRatinglinks() {
        return ratinglinks;
    }

    public void setRatinglinks(String ratinglinks) {
        this.ratinglinks = ratinglinks == null ? null : ratinglinks.trim();
    }

    public Integer getGoodsscore() {
        return goodsscore;
    }

    public void setGoodsscore(Integer goodsscore) {
        this.goodsscore = goodsscore;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}