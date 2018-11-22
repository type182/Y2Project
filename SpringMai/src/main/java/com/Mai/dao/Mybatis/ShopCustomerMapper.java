package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.ShopCustomer;

public interface ShopCustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopCustomer record);

    int insertSelective(ShopCustomer record);

    ShopCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopCustomer record);

    int updateByPrimaryKey(ShopCustomer record);
}