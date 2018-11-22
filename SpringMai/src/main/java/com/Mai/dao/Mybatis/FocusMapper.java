package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Focus;

public interface FocusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Focus record);

    int insertSelective(Focus record);

    Focus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Focus record);

    int updateByPrimaryKey(Focus record);
}