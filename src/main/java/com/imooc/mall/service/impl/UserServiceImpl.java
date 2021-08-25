package com.imooc.mall.service.impl;

import com.imooc.mall.model.dao.UserMapper;
import com.imooc.mall.model.pojo.User;
import com.imooc.mall.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述：  USerService实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser() {
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public void register(String userName, String password) {
        //查询用户名是否存在，不允许重名
        User result = userMapper.selectByName(userName);
        if(result != null){

        }
    }
}
