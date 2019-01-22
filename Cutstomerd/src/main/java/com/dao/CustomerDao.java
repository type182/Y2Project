package com.dao;

import org.apache.ibatis.annotations.Param;

import com.pojo.User;
import com.pojo.cutstomer;

public interface CustomerDao {
	public cutstomer CutstomerLoder(@Param("sdk")String sdk, @Param("pawss")String pawss);
	public cutstomer CutstomerId(@Param("sdk")String sdk);
	public User userGetid(@Param("sdk")Integer sdk);
}
