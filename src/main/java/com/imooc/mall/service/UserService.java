package com.imooc.mall.service;

import com.imooc.mall.execption.ImoocMallException;
import com.imooc.mall.model.pojo.User;

/**
 * 描述 UserService
 */
public interface UserService {

    User getUser();

    /**
     * 注册
     * @param userName
     * @param password
     */
    void register(String userName,String password) throws ImoocMallException;

    User login(String userName, String password) throws ImoocMallException;

    void updateInformation(User user) throws ImoocMallException;

    boolean checkAdminRole(User user);
}
