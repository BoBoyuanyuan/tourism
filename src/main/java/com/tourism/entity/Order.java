package com.tourism.entity;

import lombok.Data;

/**
 * 订单
 */
@Data
public class Order {
    private Integer oId;//订单ID
    private Integer oName;//订单名称
    private Integer oNum;//订单数量
    private Integer userId;//关联用户ID
    private Integer goodsId;//关联商品ID
    private Integer isDelete;//1存在 ，0删除

}