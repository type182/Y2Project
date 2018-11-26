package com.Mai.dao.Mybatis;

import org.apache.ibatis.annotations.Param;

import com.Mai.pojo.Mybatis.User;

public interface UserMapper {
	/**
	 *  用户的登陆
	 * @param name 登陆名 /用户名/手机号/邮箱
	 * @param pawss 登陆密码 密码
	 * @param sta /是否通过手机验证 1 是    其他。 否
	 * @return  登陆成功后的User对象
	 * @throws Exception
	 */
    public User UserLoder
    				(
    						@Param("name")String name,
    						@Param("pawss")String pawss
    				)throws Exception;
    
    /**
     *  用户的注册
     * @param user 准备注册的用户
     * @return  是否注册成功
     * @throws Exception
     */
    public int UserInsert(User user)throws Exception; 
}