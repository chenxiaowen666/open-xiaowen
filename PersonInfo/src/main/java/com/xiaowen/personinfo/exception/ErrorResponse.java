package com.xiaowen.personinfo.exception;

import lombok.*;
import org.springframework.util.ObjectUtils;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class ErrorResponse {

    private int code;
    private int status;
    private String message;
    private String path;
    private Instant timestamp;
    private HashMap<String, Object> data = new HashMap<String, Object>();

    public ErrorResponse(BaseException ex, String path) {
        this(ex.getError().getCode(), ex.getError().getStatus().value(), ex.getError().getMessage(), path, ex.getData());
    }

    public ErrorResponse(int code, int status, String message, String path, Map<String, Object> data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = Instant.now();
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }


}
