package com.xiaowen.personinfo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@ToString
public enum ErrorCode {
    RESOURCE_NOT_FOUND(1001, HttpStatus.NOT_FOUND, "未找到该资源"),
    REQUEST_VALIDATION_FAILED(1002, HttpStatus.BAD_REQUEST, "请求数据格式验证失败");

    private final int code;
    private final HttpStatus status;
    private final String message;

}
