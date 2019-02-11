package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Shippingaddress;

public interface ShippingaddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shippingaddress record);

    int insertSelective(Shippingaddress record);

    Shippingaddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shippingaddress record);

    int updateByPrimaryKey(Shippingaddress record);
}