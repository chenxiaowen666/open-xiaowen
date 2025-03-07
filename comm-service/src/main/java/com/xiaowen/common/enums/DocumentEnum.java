package com.xiaowen.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 文档地址
 *
 * @author xiaowen
 */
@Getter
@AllArgsConstructor
public enum DocumentEnum {

    REDIS_INSTALL("", "Redis 安装文档"),
    TENANT("", "SaaS 多租户文档");

    private final String url;
    private final String memo;

}
