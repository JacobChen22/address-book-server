package com.cwj.identity.mapper;

import com.cwj.identity.model.Organization;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    List<Organization> selectAll();

    List<Organization> getChildByParentId(String parentId);
}