package com.lanceyi.iess.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.lanceyi.iess.core.config.ApiPath;
import com.lanceyi.iess.core.wrap.WrapResult;
import com.lanceyi.iess.entity.User;
import com.lanceyi.iess.model.reponse.RepUser;
import com.lanceyi.iess.model.request.ReqUser;
import com.lanceyi.iess.service.UserService;
import com.sun.deploy.security.WrapResource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weixin.popular.bean.datacube.article.Usershare;

/**
 * @author Lance YI
 * @date 2019/7/24 15:12
 */
@RestController
@Api(tags = "User test", description = "用户测试接口")
@RequestMapping(ApiPath.User.BASE)
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("测试接口")
    @GetMapping(ApiPath.User.TEST)
    public WrapResult<RepUser> testUser(){
//        User user = userService.getUser((long) 1);
        RepUser repUser = new RepUser();
//        if (user != null) {
//            BeanUtils.copyProperties(user, repUser);
//        }
        return WrapResult.wrapSuccessResult(repUser);
    }

}
