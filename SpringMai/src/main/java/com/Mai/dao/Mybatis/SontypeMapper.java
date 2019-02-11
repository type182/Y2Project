package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Sontype;

public interface SontypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sontype record);

    int insertSelective(Sontype record);

    Sontype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sontype record);

    int updateByPrimaryKey(Sontype record);
}