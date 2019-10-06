package com.tourism.entity;

import lombok.Data;

/**
 * 文章
 */
@Data
public class Article {
    private Integer article_id;//文章ID
    private String title;//文章标题
    private String author;//作者
    private String content;//文章内容
    private String time;//发布时间
    private Integer isDelete;//文章内容

}