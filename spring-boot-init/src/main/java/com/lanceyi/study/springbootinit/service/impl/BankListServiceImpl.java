package com.lanceyi.study.springbootinit.service.impl;

import com.lanceyi.study.springbootinit.model.entity.BankList;
import com.lanceyi.study.springbootinit.mapper.BankListMapper;
import com.lanceyi.study.springbootinit.service.IBankListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lanceyi
 * @since 2019-07-19
 */
@Service
public class BankListServiceImpl extends ServiceImpl<BankListMapper, BankList> implements IBankListService {


    @Override
    public BankList listBankPages() {
        return null;
    }
}
