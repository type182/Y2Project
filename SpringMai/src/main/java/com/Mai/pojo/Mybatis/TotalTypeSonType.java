package com.Mai.pojo.Mybatis;
/**
 * 
 * @author 二级分类
 *
 */
public class TotalTypeSonType {
    private Integer id; // id

    private String sonTypeName; // 分类名

    private Integer fatherTypeid;// 一级分类id

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