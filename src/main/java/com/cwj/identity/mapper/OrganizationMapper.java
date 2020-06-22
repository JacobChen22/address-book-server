package com.cwj.identity.mapper;

import com.cwj.identity.model.Organization;
import org.springframework.stereotype.Repository;

/**
 * @author cwj
 */
@Repository
public interface OrganizationMapper {
    int deleteByPrimaryKey(String orgId);

    int insert(Organization org);

    int insertSelective(Organization org);

    Organization selectByPrimaryKey(String orgId);

    int updateByPrimaryKeySelective(Organization org);

    int updateByPrimaryKey(Organization org);
}