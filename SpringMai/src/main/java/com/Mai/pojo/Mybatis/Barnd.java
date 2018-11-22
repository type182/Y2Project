package com.Mai.pojo.Mybatis;

public class Barnd {
    private Integer id;

    private String name;

    private Integer subclass;

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