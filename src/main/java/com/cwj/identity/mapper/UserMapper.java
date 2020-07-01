package com.cwj.identity.mapper;

import com.cwj.identity.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cwj
 */
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);

    List<User> selectByOrgId(String orgId);

    List<User> selectUserByKeyWord(String keyWord);
}
