package com.cwj.identity.service.impl;

import com.cwj.identity.mapper.OrganizationMapper;
import com.cwj.identity.model.Organization;
import com.cwj.identity.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cwj
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public List<Organization> findAll() {
        return organizationMapper.selectAll();
    }

    @Override
    public List<Organization> getChild(String parentId) {
        return organizationMapper.getChildByParentId(parentId);
    }
}
