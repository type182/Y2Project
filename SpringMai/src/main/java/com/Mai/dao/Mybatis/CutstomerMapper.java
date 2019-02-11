package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Cutstomer;

public interface CutstomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cutstomer record);

    int insertSelective(Cutstomer record);

    Cutstomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cutstomer record);

    int updateByPrimaryKey(Cutstomer record);
}