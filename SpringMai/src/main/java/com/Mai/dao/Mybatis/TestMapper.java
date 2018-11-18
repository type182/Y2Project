package com.Mai.dao.Mybatis;

import java.util.List;

import com.Mai.pojo.Mybatis.User;

public interface TestMapper {
	public List<User> GetAll() throws Exception;
}
