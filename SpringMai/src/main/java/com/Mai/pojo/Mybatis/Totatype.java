package com.Mai.pojo.Mybatis;

public class Totatype {
    private Integer id;

    private String tataltypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTataltypeName() {
        return tataltypeName;
    }

    public void setTataltypeName(String tataltypeName) {
        this.tataltypeName = tataltypeName == null ? null : tataltypeName.trim();
    }
}