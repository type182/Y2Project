package com.Mai.pojo.Mybatis;

import java.util.Date;

public class GoodsRating {
    private Integer id;

    private Integer goodsId;

    private Date goodsRatingTime;

    private String goodsRatingContent;

    private String goodsRatingLinks;

    private Integer goodsScore;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getGoodsRatingTime() {
        return goodsRatingTime;
    }

    public void setGoodsRatingTime(Date goodsRatingTime) {
        this.goodsRatingTime = goodsRatingTime;
    }

    public String getGoodsRatingContent() {
        return goodsRatingContent;
    }

    public void setGoodsRatingContent(String goodsRatingContent) {
        this.goodsRatingContent = goodsRatingContent == null ? null : goodsRatingContent.trim();
    }

    public String getGoodsRatingLinks() {
        return goodsRatingLinks;
    }

    public void setGoodsRatingLinks(String goodsRatingLinks) {
        this.goodsRatingLinks = goodsRatingLinks == null ? null : goodsRatingLinks.trim();
    }

    public Integer getGoodsScore() {
        return goodsScore;
    }

    public void setGoodsScore(Integer goodsScore) {
        this.goodsScore = goodsScore;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}