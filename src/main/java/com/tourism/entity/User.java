package com.tourism.entity;

import lombok.Data;

/**
 * 普通用户
 */
@Data
public class User {
    private Integer uId;//用户id
    private String nickname;//用户昵称
    private String username;//用户登录名
    private String password;//用户登录密码
    private String sex;//性别
    private Integer age;//年龄
    private String email;//邮箱
    private Integer phone;//手机号
    private String address;//地址
    private String describe;//个人说明
    private Integer isDelete;//状态值


}
