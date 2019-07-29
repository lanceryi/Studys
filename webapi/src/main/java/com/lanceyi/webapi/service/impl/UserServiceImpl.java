package com.lanceyi.webapi.service.impl;

import com.lanceyi.webapi.mapper.UserMapper;
import com.lanceyi.webapi.model.User;
import com.lanceyi.webapi.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lance YI
 * @date 2019/7/25 11:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> getList() {
        System.out.println("--------------------------");
        List<User> users = userMapper.selectAll();
        return users;
    }
}
