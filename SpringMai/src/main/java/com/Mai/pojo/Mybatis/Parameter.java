package com.Mai.pojo.Mybatis;

public class Parameter {
    private Integer id;

    private String parameterName;

    private Integer sonid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName == null ? null : parameterName.trim();
    }

    public Integer getSonid() {
        return sonid;
    }

    public void setSonid(Integer sonid) {
        this.sonid = sonid;
    }
}