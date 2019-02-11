package com.Mai.pojo.Mybatis;

public class Shop {
    private Integer id;

    private String shopname;

    private Integer businessid;

    private String shopaddress;

    private String shopurl;

    private Integer shoptype;

    private String shopcredit;

    private Integer shophot;

    private Integer headerpicture;

    private String pagecontent;

    private Integer shopsize;

    private Integer orgsize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress == null ? null : shopaddress.trim();
    }

    public String getShopurl() {
        return shopurl;
    }

    public void setShopurl(String shopurl) {
        this.shopurl = shopurl == null ? null : shopurl.trim();
    }

    public Integer getShoptype() {
        return shoptype;
    }

    public void setShoptype(Integer shoptype) {
        this.shoptype = shoptype;
    }

    public String getShopcredit() {
        return shopcredit;
    }

    public void setShopcredit(String shopcredit) {
        this.shopcredit = shopcredit == null ? null : shopcredit.trim();
    }

    public Integer getShophot() {
        return shophot;
    }

    public void setShophot(Integer shophot) {
        this.shophot = shophot;
    }

    public Integer getHeaderpicture() {
        return headerpicture;
    }

    public void setHeaderpicture(Integer headerpicture) {
        this.headerpicture = headerpicture;
    }

    public String getPagecontent() {
        return pagecontent;
    }

    public void setPagecontent(String pagecontent) {
        this.pagecontent = pagecontent == null ? null : pagecontent.trim();
    }

    public Integer getShopsize() {
        return shopsize;
    }

    public void setShopsize(Integer shopsize) {
        this.shopsize = shopsize;
    }

    public Integer getOrgsize() {
        return orgsize;
    }

    public void setOrgsize(Integer orgsize) {
        this.orgsize = orgsize;
    }
}