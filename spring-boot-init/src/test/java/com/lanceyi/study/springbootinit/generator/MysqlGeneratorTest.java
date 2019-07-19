package com.lanceyi.study.springbootinit.generator;

import org.junit.Test;

public class MysqlGeneratorTest {

    @Test
    public void generator() {
        MysqlGenerator mysqlGenerator = new MysqlGenerator();
//        mysqlGenerator.generator("bank_list");
        mysqlGenerator.generator("sys_user");
    }
}