package com.Mai.dao.Mybatis;

import com.Mai.pojo.Mybatis.UserReply;

public interface UserReplyMapper {
    int insert(UserReply record);

    int insertSelective(UserReply record);
}