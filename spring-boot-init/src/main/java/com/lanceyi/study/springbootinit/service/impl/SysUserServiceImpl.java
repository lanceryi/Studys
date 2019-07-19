package com.lanceyi.study.springbootinit.service.impl;

import com.lanceyi.study.springbootinit.model.entity.SysUser;
import com.lanceyi.study.springbootinit.mapper.SysUserMapper;
import com.lanceyi.study.springbootinit.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lance yi
 * @since 2019-07-19
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
