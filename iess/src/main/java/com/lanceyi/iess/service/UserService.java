package com.lanceyi.iess.service;

import com.lanceyi.iess.entity.User;
import com.lanceyi.iess.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lance YI
 * @date 2019/7/24 14:40
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser(Long id){
        return userRepository.getOne(id);
    }
}
