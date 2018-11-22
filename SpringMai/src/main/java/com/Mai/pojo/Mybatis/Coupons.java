package com.Mai.pojo.Mybatis;

import java.util.Date;

public class Coupons {
    private Integer id;

    private String name;

    private Double reduction;

    private Double reductionConditions;

    private Integer number;

    private Date overtime;

    private Integer shopId;

    private Boolean yesNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getReduction() {
        return reduction;
    }

    public void setReduction(Double reduction) {
        this.reduction = reduction;
    }

    public Double getReductionConditions() {
        return reductionConditions;
    }

    public void setReductionConditions(Double reductionConditions) {
        this.reductionConditions = reductionConditions;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Boolean getYesNo() {
        return yesNo;
    }

    public void setYesNo(Boolean yesNo) {
        this.yesNo = yesNo;
    }
}