package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Goodsrating;

public interface GoodsratingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsrating record);

    int insertSelective(Goodsrating record);

    Goodsrating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsrating record);

    int updateByPrimaryKey(Goodsrating record);
}