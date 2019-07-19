package com.lanceyi.study.springbootinit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lanceyi
 * @since 2019-07-19
 */
@RestController
@RequestMapping("/bank-list")
public class BankListController {


    /**
     * TODO
     * mybatis-plus使用规则
     * 1. @Autowired  %sService
     * 2. %sServiceImpl 重写 %sService中的接口
     * 3. %sServiceImpl 中调用 %sMapper 中的接口
     * 4. %sMapper中的接口实现两种：
     *    (1): resources/mapper 写xml SQL
     *    (2): @Query 注解的方式
     */



}
