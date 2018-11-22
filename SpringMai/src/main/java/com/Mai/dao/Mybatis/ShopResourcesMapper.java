package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.ShopResources;

public interface ShopResourcesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopResources record);

    int insertSelective(ShopResources record);

    ShopResources selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopResources record);

    int updateByPrimaryKey(ShopResources record);
}