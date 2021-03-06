/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lidai
 * @date 2018/11/1 9:35
 */
@Data
public class UserRole implements Serializable {
    private String userId;
    private String roleId;
}

