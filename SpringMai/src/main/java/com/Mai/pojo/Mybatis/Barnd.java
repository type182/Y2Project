package com.Mai.pojo.Mybatis;
/**
 * 
 * @author 第三级分类
 * 	参数
 *
 */
public class Barnd {
    private Integer id; //参数id

    private String name; //参数名

    private Integer subclass; //二级分类的id
    

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

    public Integer getSubclass() {
        return subclass;
    }

    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }
}