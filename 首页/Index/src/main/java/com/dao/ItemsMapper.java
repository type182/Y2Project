package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Coupons;
import com.pojo.Goods;
import com.pojo.Totatype;

public interface ItemsMapper {
	public List<Totatype> selectTotlsOn();
	public List<Goods> selectGoodsPopularity(@Param("type")Integer type);
	public List<Coupons> selectGoodsCoupon(@Param("Type")String type);
	public List<Goods> selectLikeGoods(@Param("Type")Integer type);
	public List<Goods> select();
}
