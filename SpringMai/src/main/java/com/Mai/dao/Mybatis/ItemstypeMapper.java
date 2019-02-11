package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Itemstype;

public interface ItemstypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Itemstype record);

    int insertSelective(Itemstype record);

    Itemstype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Itemstype record);

    int updateByPrimaryKey(Itemstype record);
}