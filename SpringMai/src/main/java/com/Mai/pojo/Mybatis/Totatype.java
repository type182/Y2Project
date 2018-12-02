package com.Mai.pojo.Mybatis;
/**
 * 
 * @author 总分类
 *
 */
public class Totatype {
    private Integer id; //分类id

    private String tataltypeName;  //分类名

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