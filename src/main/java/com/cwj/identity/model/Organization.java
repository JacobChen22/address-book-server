package com.cwj.identity.model;

import lombok.Data;

import java.io.Serializable;

/**
 * organization
 *
 * @author cwj
 */
@Data
public class Organization implements Serializable {
    private String orgId;

    private String name;

    private String parentId;

    private String orgPathId;

    private String pathName;

    private static final long serialVersionUID = 1L;
}