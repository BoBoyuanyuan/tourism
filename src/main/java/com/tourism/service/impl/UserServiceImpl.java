package com.tourism.service.impl;

import com.tourism.entity.User;
import com.tourism.mapper.IUserMapper;
import com.tourism.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer uDi) {
        return userMapper.deleteByPrimaryKey(uDi);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer uDi) {
        return userMapper.selectByPrimaryKey(uDi);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

}
