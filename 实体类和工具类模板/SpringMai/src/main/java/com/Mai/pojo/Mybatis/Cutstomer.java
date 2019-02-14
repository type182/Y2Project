package com.Mai.pojo.Mybatis;

public class Cutstomer {
    private Integer id;

    private String sdk;

    private String pawss;

    private Integer businessid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSdk() {
        return sdk;
    }

    public void setSdk(String sdk) {
        this.sdk = sdk == null ? null : sdk.trim();
    }

    public String getPawss() {
        return pawss;
    }

    public void setPawss(String pawss) {
        this.pawss = pawss == null ? null : pawss.trim();
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }
}