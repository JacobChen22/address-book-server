package com.cwj.identity.service;

import com.cwj.identity.model.User;

import java.util.List;

/**
 * @author cwj
 */
public interface UserService {

    List<User> findUserByOrgId(String orgId);

    List<User> findUserByKeyWord(String keyWord);
}
