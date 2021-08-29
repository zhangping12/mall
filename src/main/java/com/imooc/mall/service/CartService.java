package com.imooc.mall.service;

import com.imooc.mall.execption.ImoocMallException;
import com.imooc.mall.model.pojo.User;
import com.imooc.mall.vo.CartVO;

import java.util.List;

/**
 * 描述 购物车Service
 */
public interface CartService {


    List<CartVO> add(Integer userId, Integer productId, Integer count);
}
