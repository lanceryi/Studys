package com.lanceyi.study.springbootinit;

import com.lanceyi.study.springbootinit.generator.MysqlGenerator;
import com.lanceyi.study.springbootinit.model.entity.BankList;
import com.lanceyi.study.springbootinit.service.IBankListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootInitApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    IBankListService bankListService;
    @Test
    public void testSelect(){
        System.out.println("----- selectAll method test ------");

        List<BankList> list = bankListService.list(null);
        list.forEach(System.out::println);
    }

}
