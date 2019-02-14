package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Goodsuserrating;

public interface GoodsuserratingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsuserrating record);

    int insertSelective(Goodsuserrating record);

    Goodsuserrating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsuserrating record);

    int updateByPrimaryKey(Goodsuserrating record);
}