package com.xiaowen.service;

import com.xiaowen.common.pojo.CommonResult;
import com.xiaowen.controller.user.vo.user.UserSaveReqVO;
import org.springframework.stereotype.Service;

@Service
public interface AdminUserService {
    /**
     * 创建用户
     *
     *
     * @param reqVO 用户信息
     * @return 用户编号
     */
    Long createUser(UserSaveReqVO reqVO);
    Long createUser2(UserSaveReqVO reqVO);

}