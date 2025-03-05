package com.xiaowen.personinfo.service;

import com.xiaowen.personinfo.domain.dto.UserDTO;
import com.xiaowen.personinfo.domain.po.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaowen
 * @since 2025-02-27
 */
public interface IUserService extends IService<User> {
    List<UserDTO> pageQueryUsers(List<Long> ids);
}
