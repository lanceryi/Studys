package com.lanceyi.webapi.controller;

import com.lanceyi.webapi.core.constant.Path;
import com.lanceyi.webapi.core.wrap.WrapResult;
import com.lanceyi.webapi.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Lance YI
 * @date 2019/7/25 11:26
 */
@RestController
@RequestMapping(Path.Test.BASE)
@Api(tags = "用户管理", description = "用户管理控制器")
public class UserController {

    @GetMapping(Path.Test.LIST)
    @ApiOperation(value = "测试接口")
    public WrapResult getList() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new User());
        return WrapResult.wrapSuccessResult(list);
    }
}
