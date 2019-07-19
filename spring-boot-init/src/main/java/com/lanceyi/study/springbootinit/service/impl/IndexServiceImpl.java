package com.lanceyi.study.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lanceyi.study.springbootinit.model.entity.IndexEntity;
import com.lanceyi.study.springbootinit.mapper.IndexMapper;
import com.lanceyi.study.springbootinit.service.IIndexService;
import org.springframework.stereotype.Service;

/**
 * @author Lance YI
 * @date 2019/7/19 14:54
 */
@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, IndexEntity> implements IIndexService {

}
