package com.lanceyi.study.springbootinit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lance YI
 * @date 2019/7/19 14:50
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String Index(){
        return "/index.html";
    }
}
