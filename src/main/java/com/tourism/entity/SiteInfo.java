package com.tourism.entity;

import lombok.Data;

/**
 * 站点信息
 */
@Data
public class SiteInfo {
    private Integer id;//站点编号
    private String title;//站点标题
    private String subtitle;//站点副标题
    private String domain;//站点地址
    private String logo;//站点LOGO地址
    private String description;//站点描述
    private String icp;//站点备案
    private String copyright;//版权信息

}