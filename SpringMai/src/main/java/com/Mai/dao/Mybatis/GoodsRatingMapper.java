package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.GoodsRating;

public interface GoodsRatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsRating record);

    int insertSelective(GoodsRating record);

    GoodsRating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsRating record);

    int updateByPrimaryKey(GoodsRating record);
}