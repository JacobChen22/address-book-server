package com.cwj.identity.model;

import lombok.Data;

import java.io.Serializable;

/**
 * user
 *
 * @author cwj
 */
@Data
public class User implements Serializable {
    private String userId;

    private String name;

    private String orgId;

    private String position;

    private static final long serialVersionUID = 1L;
}