package com.Mai.pojo.Mybatis;

public class UserReply {
    private Integer userid;

    private Integer userids;

    private String context;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserids() {
        return userids;
    }

    public void setUserids(Integer userids) {
        this.userids = userids;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}