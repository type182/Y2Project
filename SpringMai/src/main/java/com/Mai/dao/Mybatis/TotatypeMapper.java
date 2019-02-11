package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Totatype;

public interface TotatypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Totatype record);

    int insertSelective(Totatype record);

    Totatype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Totatype record);

    int updateByPrimaryKey(Totatype record);
}