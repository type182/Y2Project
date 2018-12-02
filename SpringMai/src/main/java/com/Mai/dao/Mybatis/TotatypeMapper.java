package com.Mai.dao.Mybatis;

import java.util.List;

import com.Mai.pojo.Mybatis.Totatype;

public interface TotatypeMapper {
	public int deleteByPrimaryKey(Integer id);

    public int insert(Totatype record);

    public int insertSelective(Totatype record);
    public List<Totatype> query();
    public Totatype selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(Totatype record);

    public int updateByPrimaryKey(Totatype record);
}