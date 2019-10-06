package com.tourism.entity;

import lombok.Data;

/**
 * 公司信息
 */
@Data
public class Company {
    private String id;//站点编号
    private String name;//公司名称
    private String address;//公司地址
    private String postcode;//邮政编码
    private String contact;//公司联系人
    private String mobile;//手机号码
    private String phone;//电话号码
    private String fax;//公司传真
    private String email;//电子邮箱
    private String qq;//公司QQ

}