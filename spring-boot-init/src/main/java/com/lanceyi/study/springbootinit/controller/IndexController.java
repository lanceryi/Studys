package com.lanceyi.study.springbootinit.controller;

import com.lanceyi.study.springbootinit.common.Path;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lance YI
 * @date 2019/7/19 14:50
 */
@RestController
@Api(tags = "首页相关接口")
public class IndexController {

    @RequestMapping(Path.Index.BASE)
    @ResponseBody
    public String Index(){
        return "index";
    }
}
