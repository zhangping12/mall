package com.imooc.mall.common;

import com.google.common.collect.Sets;
import com.imooc.mall.execption.ImoocMallException;
import com.imooc.mall.execption.ImoocMallExceptionEnum;
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

    /**
     * 订单状态枚举
     */
    public enum OrderStatusEnum {
        CANCELED(0, "用户已取消"),
        NOT_PAID(10, "未付款"),
        PAID(20, "已付款"),
        DELIVERED(30, "已发货"),
        FINISHED(40, "交易完成");

        private String value;
        private int code;

        OrderStatusEnum(int code, String value) {
            this.value = value;
            this.code = code;
        }

        public static OrderStatusEnum codeof(int code) {
            for (OrderStatusEnum orderStatusEnum : values()) {
                if (orderStatusEnum.getCode() == code) {
                    return orderStatusEnum;
                }
            }
            throw new ImoocMallException(ImoocMallExceptionEnum.NO_ENUM);
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
