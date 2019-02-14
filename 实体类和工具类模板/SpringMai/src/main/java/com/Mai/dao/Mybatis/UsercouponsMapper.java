package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Usercoupons;

public interface UsercouponsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usercoupons record);

    int insertSelective(Usercoupons record);

    Usercoupons selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usercoupons record);

    int updateByPrimaryKey(Usercoupons record);
}