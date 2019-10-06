package com.tourism.service;

import com.tourism.entity.User;
public interface IUserService {


    int deleteByPrimaryKey(Integer uDi);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uDi);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
