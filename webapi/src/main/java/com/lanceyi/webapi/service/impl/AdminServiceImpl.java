package com.lanceyi.webapi.service.impl;

import com.lanceyi.webapi.core.base.BaseService;
import com.lanceyi.webapi.core.base.QueryListParam;
import com.lanceyi.webapi.mapper.AdminMapper;
import com.lanceyi.webapi.model.Admin;
import com.lanceyi.webapi.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author Lance YI
 * @date 2019/7/26 14:48
 */
@Service
public class AdminServiceImpl extends BaseService<AdminMapper,Admin> implements AdminService {


    @Override
    public List<Admin> queryAdminList(Admin admin, QueryListParam queryListParam) {
        super.setPageQueryParam(queryListParam);

        List<Admin> list = this.queryAdminList(admin);

        return list;
    }
    /**
     * 重载查询管理员列表
     *
     * @param admin
     * @return
     */

    @Override
    public List<Admin> queryAdminList(Admin admin) {

//        Example example = new Example(Admin.class);
//        Example.Criteria criteria = example.createCriteria();
//
//        String loginName = admin.getLoginName();
//        if (StringUtils.isNotEmpty(loginName)) {
//            criteria.andEqualTo("login_name",loginName);
//        }
//
//        Integer adminType = admin.getAdminType();
//        if (adminType != null) {
//            criteria.andEqualTo("admin_type",adminType);
//        }
//
//        Byte adminEffective = admin.getAdminEffective();
//        if (adminEffective != null) {
//            criteria.andEqualTo("admin_effective",adminEffective);
//        }
//
//        Byte adminActivation = admin.getAdminActivation();
//        if (adminActivation != null) {
//            criteria.andEqualTo("admin_activation",adminActivation);
//        }
//
//        // 排除管理员
//        criteria.andNotEqualTo("admin_type",-1);

//        List<Admin> list = super.mapper.selectByExample(criteria);

        List<Admin> list = super.mapper.selectAll();
        return list;
    }
}
