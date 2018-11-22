package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.ItemsType;

public interface ItemsTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemsType record);

    int insertSelective(ItemsType record);

    ItemsType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemsType record);

    int updateByPrimaryKey(ItemsType record);
}