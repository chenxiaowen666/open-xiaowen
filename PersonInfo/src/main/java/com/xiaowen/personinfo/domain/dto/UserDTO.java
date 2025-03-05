package com.xiaowen.personinfo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    /**
     * 用户名
     */
    private String username;
    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 性别（0:未设置,1:男,2:女）
     */
    private Integer gender;

    /**
     * 状态（0:禁用,1:正常）
     */
    private Integer status;
}
