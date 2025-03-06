package com.xiaowen.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component // 交给 Spring 管理
public class MyMetaObjectHandler implements MetaObjectHandler {
    //strictInsertFill 和 strictUpdateFill：确保字段存在时才填充，避免覆盖已有值。
    @Override
    public void insertFill(MetaObject metaObject) {
        // 填充 createTime 和 updateTime（插入时）
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 填充 updateTime（更新时）
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
    }
}