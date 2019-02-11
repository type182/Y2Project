package com.Mai.pojo.Mybatis;

import java.util.Date;

public class Goodsuserrating {
    private Integer id;

    private Integer uid;

    private Integer uidcounts;

    private String content;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUidcounts() {
        return uidcounts;
    }

    public void setUidcounts(Integer uidcounts) {
        this.uidcounts = uidcounts;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}