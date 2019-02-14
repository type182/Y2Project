package com.Mai.pojo.Mybatis;

public class Sontype {
    private Integer id;

    private String name;

    private Integer fatherid;

    private Integer sonid;

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

    public Integer getFatherid() {
        return fatherid;
    }

    public void setFatherid(Integer fatherid) {
        this.fatherid = fatherid;
    }

    public Integer getSonid() {
        return sonid;
    }

    public void setSonid(Integer sonid) {
        this.sonid = sonid;
    }
}