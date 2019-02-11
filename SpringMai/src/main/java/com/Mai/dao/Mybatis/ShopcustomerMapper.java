package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Shopcustomer;

public interface ShopcustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shopcustomer record);

    int insertSelective(Shopcustomer record);

    Shopcustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shopcustomer record);

    int updateByPrimaryKey(Shopcustomer record);
}