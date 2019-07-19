package com.lanceyi.study.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Lance YI
 * @date 2019/7/19 15:10
 */
@TableName("index_test")
@Data
public class IndexEntity {
    private Long id;
    private String name;
}
