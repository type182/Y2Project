package com.Mai.pojo.Mybatis;

public class Shop {
    private Integer id;

    private String shopName;

    private Integer userId;

    private String shopAddress;

    private String shopUrl;

    private Integer shopType;

    private String shopCredit;

    private Integer shopHot;

    private Integer shopHeaderPicture;

    private String shopHomePageContent;

    private Integer shopSize;

    private Integer shopOreSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl == null ? null : shopUrl.trim();
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getShopCredit() {
        return shopCredit;
    }

    public void setShopCredit(String shopCredit) {
        this.shopCredit = shopCredit == null ? null : shopCredit.trim();
    }

    public Integer getShopHot() {
        return shopHot;
    }

    public void setShopHot(Integer shopHot) {
        this.shopHot = shopHot;
    }

    public Integer getShopHeaderPicture() {
        return shopHeaderPicture;
    }

    public void setShopHeaderPicture(Integer shopHeaderPicture) {
        this.shopHeaderPicture = shopHeaderPicture;
    }

    public String getShopHomePageContent() {
        return shopHomePageContent;
    }

    public void setShopHomePageContent(String shopHomePageContent) {
        this.shopHomePageContent = shopHomePageContent == null ? null : shopHomePageContent.trim();
    }

    public Integer getShopSize() {
        return shopSize;
    }

    public void setShopSize(Integer shopSize) {
        this.shopSize = shopSize;
    }

    public Integer getShopOreSize() {
        return shopOreSize;
    }

    public void setShopOreSize(Integer shopOreSize) {
        this.shopOreSize = shopOreSize;
    }
}