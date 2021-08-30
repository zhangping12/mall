package com.imooc.mall.controller;

import com.imooc.mall.model.request.CreateOrderReq;
import com.imooc.mall.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 描述：订单Controller
 */
@RestController
public class OrderController {
    @Resource
    OrderService orderService;

    @PostMapping("/order/create")
    public ApiOperation create(@Valid @RequestBody CreateOrderReq createOrderReq) {
        return null;
    }
}
