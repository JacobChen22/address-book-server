package com.cwj.identity.service.impl;

import com.cwj.identity.mapper.UserMapper;
import com.cwj.identity.model.User;
import com.cwj.identity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cwj
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

}
