package com.tourism.entity;

import lombok.Data;

/**
 * 管理员
 */
@Data
public class Admin {
    private Integer aId;//管理员ID
    private String username;//管理员用户名
    private String nickname;//昵称
    private String password;//密码
    private String last_login;//最后一次登录时间
    private Integer isDelete;//状态值
}
