package com.lanceyi.webapi.service;

import com.lanceyi.webapi.core.base.QueryListParam;
import com.lanceyi.webapi.model.Admin;

import java.util.List;

/**
 * @author Lance YI
 * @date 2019/7/26 14:45
 */
public interface AdminService {

    /**
     * Test 如何使用分页
     * @param admin
     * @param queryListParam
     * @return
     */
    List<Admin> queryAdminList(Admin admin, QueryListParam queryListParam);

    List<Admin> queryAdminList(Admin admin);

}
