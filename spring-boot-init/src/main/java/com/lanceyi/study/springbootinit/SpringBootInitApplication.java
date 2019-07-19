package com.lanceyi.study.springbootinit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lanceyi.study.springbootinit.mapper")
public class SpringBootInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInitApplication.class, args);
    }

}
