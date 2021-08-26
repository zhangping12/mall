package com.imooc.mall.controller;

import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.common.Constant;
import com.imooc.mall.execption.ImoocMallExceptionEnum;
import com.imooc.mall.model.pojo.User;
import com.imooc.mall.model.request.AddCategoryReq;
import com.imooc.mall.service.CategoryService;
import com.imooc.mall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 描述：目录Controller
 */
@Controller
public class CategoryController {
    @Resource
    private UserService userService;

    @Resource
    private CategoryService categoryService;

    @PostMapping("/admin/category/add")
    @ResponseBody
    public ApiRestResponse addCategory(HttpSession session, @RequestBody AddCategoryReq addCategoryReq){
        if (addCategoryReq.getName() == null ||addCategoryReq.getParentId() == null ||addCategoryReq.getOrderNum()==null||addCategoryReq.getType()==null) {
            return ApiRestResponse.error(ImoocMallExceptionEnum.PARA_NOT_NULL);
        }
        User currentUser = (User)session.getAttribute(Constant.IMOOC_MALL_USER);
        if(currentUser == null){
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_LOGIN);
        }
        //校验是否是管理员
        if (userService.checkAdminRole(currentUser)) {
            //是管理员，执行操作
            categoryService.add(addCategoryReq);
            return ApiRestResponse.success();
        }else {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_ADMIN);
        }
    }
}
