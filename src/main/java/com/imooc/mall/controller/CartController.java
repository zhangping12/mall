package com.imooc.mall.controller;

import com.imooc.mall.common.ApiRestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：购物车Controller
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @PostMapping("/add")
    public ApiRestResponse add(@RequestParam Integer productId, @RequestParam Integer count) {
        return null;

    }
}
