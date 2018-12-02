package com.Mai.pojo.Mybatis;
/**
 * 
 * @author 订单状态
 *
 */
public class ItemsType {
    private Integer id; //状态id

    private String statusName;//状态名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }
}