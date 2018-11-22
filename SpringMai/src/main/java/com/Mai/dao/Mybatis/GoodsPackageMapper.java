package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.GoodsPackage;

public interface GoodsPackageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsPackage record);

    int insertSelective(GoodsPackage record);

    GoodsPackage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsPackage record);

    int updateByPrimaryKey(GoodsPackage record);
}