package com.lanceyi.webapi.controller;

import com.lanceyi.webapi.core.constant.Path;
import com.lanceyi.webapi.core.wrap.WrapResult;
import com.lanceyi.webapi.model.Admin;
import com.lanceyi.webapi.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lance YI
 * @date 2019/7/25 11:26
 */
@RestController
@RequestMapping(Path.Test.ADMIN)
@Api(tags = "管理员接口", description = "用户管理控制器")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping(Path.Test.ADMIN_LIST)
    @ApiOperation(value = "测试接口")
    public WrapResult getAdminList() {
        Admin admin = new Admin();
        List<Admin> adminList = adminService.queryAdminList(admin);
        return WrapResult.wrapSuccessResult(adminList);
    }
}
