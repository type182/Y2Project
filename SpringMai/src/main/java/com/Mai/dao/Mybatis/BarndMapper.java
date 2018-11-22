package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Barnd;

public interface BarndMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Barnd record);

    int insertSelective(Barnd record);

    Barnd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Barnd record);

    int updateByPrimaryKey(Barnd record);
}