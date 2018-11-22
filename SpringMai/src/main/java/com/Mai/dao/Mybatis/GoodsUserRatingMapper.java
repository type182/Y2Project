package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.GoodsUserRating;

public interface GoodsUserRatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsUserRating record);

    int insertSelective(GoodsUserRating record);

    GoodsUserRating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsUserRating record);

    int updateByPrimaryKey(GoodsUserRating record);
}