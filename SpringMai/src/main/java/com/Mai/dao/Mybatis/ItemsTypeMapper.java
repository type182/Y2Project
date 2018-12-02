package com.Mai.dao.Mybatis;

import org.apache.ibatis.annotations.Param;

import com.Mai.pojo.Mybatis.ItemsType;

public interface ItemsTypeMapper {
	public ItemsType queryItemsType(@Param("id")Integer id);
}