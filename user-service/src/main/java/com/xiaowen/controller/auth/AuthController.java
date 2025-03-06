package com.xiaowen.controller.auth;

import com.xiaowen.common.pojo.CommonResult;
import com.xiaowen.controller.auth.ov.AuthLoginReqVO;
import com.xiaowen.controller.auth.ov.AuthLoginRespVO;
import com.xiaowen.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.xiaowen.common.pojo.CommonResult.success;
@RestController("/system/auth")
public class AuthController {

//    @Autowired
//    private AuthService authService;

//    @Operation(summary = "使用账号密码登录")
//    @PostMapping("/login")
//    public CommonResult<AuthLoginRespVO> login(@RequestBody @Valid AuthLoginReqVO reqVO) {
//        return success(authService.login(reqVO));
//    }

}
