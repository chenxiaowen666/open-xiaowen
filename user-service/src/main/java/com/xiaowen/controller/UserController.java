package com.xiaowen.controller;

import com.xiaowen.common.pojo.CommonResult;
import com.xiaowen.controller.user.vo.user.UserSaveReqVO;
import com.xiaowen.service.AdminUserService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.security.PermitAll;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.xiaowen.common.pojo.CommonResult.success;


@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    private AdminUserService userService;

    @PostMapping("/create")
    @Operation(summary = "新增用户")
//    @PreAuthorize("@ss.hasPermission('system:user:create')")
    @PreAuthorize("permitAll()") // 允许所有人访问
    public CommonResult<Long> createUser(@Valid @RequestBody UserSaveReqVO reqVO) {
        Long id = userService.createUser(reqVO);
        return success(id);
    }



}

