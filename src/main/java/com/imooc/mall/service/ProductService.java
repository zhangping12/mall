package com.imooc.mall.service;

import com.imooc.mall.model.pojo.Product;
import com.imooc.mall.model.request.AddProductReq;

/**
 * 描述：商品Service
 */
public interface ProductService {

    void add(AddProductReq addProductReq);

    void update(Product updateProduct);

    void delete(Integer id);

    void batchUpdateSellStatus(Integer[] ids, Integer sellStatus);
}
