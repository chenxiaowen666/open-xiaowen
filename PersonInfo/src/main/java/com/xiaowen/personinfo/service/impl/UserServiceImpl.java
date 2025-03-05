package com.xiaowen.personinfo.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.xiaowen.personinfo.domain.dto.UserDTO;
import com.xiaowen.personinfo.domain.po.User;
import com.xiaowen.personinfo.mapper.UserMapper;
import com.xiaowen.personinfo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaowen
 * @since 2025-02-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<UserDTO> pageQueryUsers(List<Long> ids) {
        List<User> users = baseMapper.selectBatchIds(ids);
        if (users == null || CollUtil.isEmpty(users)) {
            return Collections.emptyList();
        }
        List<UserDTO> userList = users.stream().map(user -> {
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(user.getUsername());
            userDTO.setEmail(user.getEmail());
            userDTO.setPhone(user.getPhone());
            userDTO.setBirthday(user.getBirthday());
            userDTO.setGender(user.getGender());
            userDTO.setStatus(user.getStatus());
            return userDTO;
        }).collect(Collectors.toList());
        return userList;
    }
}
