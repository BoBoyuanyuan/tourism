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

    public Admin(Integer aId, String username, String nickname, String password, String last_login, Integer isDelete) {
        this.aId = aId;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.last_login = last_login;
        this.isDelete = isDelete;
    }

    public Admin() {
    }

    public Admin(String username, String nickname, String password) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
    }

    public Admin(Integer aId, String password) {
        this.aId = aId;
        this.password = password;
    }
}
