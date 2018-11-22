package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.TotalTypeSonType;

public interface TotalTypeSonTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TotalTypeSonType record);

    int insertSelective(TotalTypeSonType record);

    TotalTypeSonType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TotalTypeSonType record);

    int updateByPrimaryKey(TotalTypeSonType record);
}