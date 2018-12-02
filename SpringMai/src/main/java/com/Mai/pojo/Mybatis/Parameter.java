package com.Mai.pojo.Mybatis;
/**
 * 
 * @author 第四级分类
 * 		参数的子类型
 *
 */
public class Parameter {
    private Integer id; 

    private String parameterName;//子类型名

    private Integer sonid; //参数id

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