package com.lanceyi.study.springbootinit.service;

import com.lanceyi.study.springbootinit.model.entity.BankList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author lanceyi
 * @since 2019-07-19
 */
public interface IBankListService extends IService<BankList> {
    BankList listBankPages();
}
