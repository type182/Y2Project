package com.dao;


import org.apache.ibatis.annotations.Param;

import com.pojo.User;

public interface UserMapper {
	/**
	 * 
	 * @param name  用户名
	 * @param pass 密码
	 * @param type 登陆类型
	 * @return
	 */
	public User UserLoder(@Param("name") String name,
			@Param("pawss") String pass ,
			@Param("Type") Integer type );
}
