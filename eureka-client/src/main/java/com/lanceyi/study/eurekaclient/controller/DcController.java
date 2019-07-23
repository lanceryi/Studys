package com.lanceyi.study.eurekaclient.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lance YI
 * @date 2019/7/23 11:12
 */
@RestController
public class DcController {

    @RequestMapping("/dc")
    public String dc(){
        return "services: " +1111;
    }

}
