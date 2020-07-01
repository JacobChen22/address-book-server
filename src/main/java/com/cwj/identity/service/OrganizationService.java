package com.cwj.identity.service;

import com.cwj.identity.model.Organization;

import java.util.List;

/**
 * @author cwj
 */
public interface OrganizationService {

    List<Organization> findAll();

    List<Organization> getChild(String parentId);
}
