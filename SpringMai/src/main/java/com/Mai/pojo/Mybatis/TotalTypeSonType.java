package com.Mai.pojo.Mybatis;

public class TotalTypeSonType {
    private Integer id;

    private String sonTypeName;

    private Integer fatherTypeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSonTypeName() {
        return sonTypeName;
    }

    public void setSonTypeName(String sonTypeName) {
        this.sonTypeName = sonTypeName == null ? null : sonTypeName.trim();
    }

    public Integer getFatherTypeid() {
        return fatherTypeid;
    }

    public void setFatherTypeid(Integer fatherTypeid) {
        this.fatherTypeid = fatherTypeid;
    }
}