package com.Mai.pojo.Mybatis;

import java.util.Date;
/**
 * 
 * @author 管理员操作记录的实体类
 *
 */
public class AdminOperation {
    private Integer id;

    private Integer adminId;  //管理员id

    private Date time;  //操作时间

    private String reason;  //操作理由

    private String log;  //操作日志

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log == null ? null : log.trim();
    }
}