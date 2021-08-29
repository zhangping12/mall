package com.imooc.mall.common;

import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * 描述：常量值
 */
@Component
public class Constant {

    /**
     * 放入 session 中的对象
     */
    public static final String IMOOC_MALL_USER = "imooc_mall_user";
    /**
     * 盐值
     */
    public static final String SALT = "8sdfsdfsdf,.03[]";

    /**
     * 图片上传路径的配置
     */
    public static String FILE_UPLOAD_DIR;

    @Value("${file.upload.dir}")//需要去lication.properties去配置
    public void setFileUploadDir(String fileUploadDir) {
        FILE_UPLOAD_DIR = fileUploadDir;
    }

    /**
     * 排序字段定义
     */
    public interface ProductListOrderBy {
        Set<String> PRICE_ORDER_ENUM = Sets.newHashSet("price desc", "price asc");
    }

    /**
     * 商品上下架状态
     */
    public interface SaleStatus {
        int NOT_SALE = 0;//商品下架状态
        int SALE = 1;//商品上架状态
    }

    /**
     * 购物车状态
     */
    public interface Cart {
        int UN_CHECKED = 0;//购物车未选中状态
        int CHECKED = 1;//购物车选中状态
    }
}
