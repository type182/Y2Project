package com.Mai.pojo.Mybatis;

public class GoodsPackage {
    private Integer id;

    private Integer goodsid;

    private String packageName;

    private String packageParameter;

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

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getPackageParameter() {
        return packageParameter;
    }

    public void setPackageParameter(String packageParameter) {
        this.packageParameter = packageParameter == null ? null : packageParameter.trim();
    }
}