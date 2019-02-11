package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.Userreply;

public interface UserreplyMapper {
    int insert(Userreply record);

    int insertSelective(Userreply record);
}