package com.Mai.pojo.Mybatis;

public class Totatype {
    private Integer id;

    private String tataltypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTataltypename() {
        return tataltypename;
    }

    public void setTataltypename(String tataltypename) {
        this.tataltypename = tataltypename == null ? null : tataltypename.trim();
    }
}