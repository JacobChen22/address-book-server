package com.cwj.identity.service.impl;

import com.cwj.identity.mapper.UserMapper;
import com.cwj.identity.model.User;
import com.cwj.identity.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author cwj
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findUserByOrgId(String orgId) {
        return userMapper.selectByOrgId(orgId);
    }

    @Override
    public List<User> findUserByKeyWord(String keyWord) {
        String searchKey = Optional.ofNullable(keyWord).orElse("");
        return userMapper.selectUserByKeyWord(searchKey);
    }

}
