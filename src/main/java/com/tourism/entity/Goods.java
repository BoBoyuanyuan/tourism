package com.tourism.entity;

import lombok.Data;

/**
 * 商品
 */
@Data
public class Goods {
    private Integer gId;//商品ID
    private Integer title;//商品标题
    private Integer pic;//商品图片
    private Integer name;//商品名称
    private Integer address;//出发地点
    private Integer goAddress;//目的地
    private double price;//原价
    private double newPrice;//优惠价
    private Integer goodsNum;//库存
    private Integer describe;//描述
    private Integer longTime;//旅行时长
    private Integer date;//进行日期
    private Integer isDelete;//状态


}