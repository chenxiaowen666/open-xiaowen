package com.xiaowen.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.xiaowen.common.enums.CommonStatusEnum;
import com.xiaowen.common.util.object.BeanUtils;
import com.xiaowen.controller.user.vo.user.UserSaveReqVO;
import com.xiaowen.entity.AdminUserDO;
import com.xiaowen.mapper.AdminUserMapper;
import com.xiaowen.service.AdminUserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.xiaowen.enums.LogRecordConstants.*;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AdminUserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
//    @LogRecord(type = SYSTEM_USER_TYPE, subType = SYSTEM_USER_CREATE_SUB_TYPE, bizNo = "{{#user.id}}",
//            success = SYSTEM_USER_CREATE_SUCCESS)
    public Long createUser(UserSaveReqVO createReqVO) {
//        // 1.1 校验账户配合
//        tenantService.handleTenantInfo(tenant -> {
//            long count = userMapper.selectCount();
//            if (count >= tenant.getAccountCount()) {
//                throw exception(USER_COUNT_MAX, tenant.getAccountCount());
//            }
//        });
        // 1.2 校验正确性
//        validateUserForCreateOrUpdate(null, createReqVO.getUsername(),
//                createReqVO.getMobile(), createReqVO.getEmail(), createReqVO.getDeptId(), createReqVO.getPostIds());
        // 2.1 插入用户
        AdminUserDO user = BeanUtils.toBean(createReqVO, AdminUserDO.class);
        user.setStatus(CommonStatusEnum.ENABLE.getStatus()); // 默认开启
        user.setPassword(encodePassword(createReqVO.getPassword())); // 加密密码
        userMapper.insert(user);
        // 2.2 插入关联岗位
//        if (CollectionUtil.isNotEmpty(user.getPostIds())) {
//            userPostMapper.insertBatch(convertList(user.getPostIds(),
//                    postId -> new UserPostDO().setUserId(user.getId()).setPostId(postId)));
//        }

        // 3. 记录操作日志上下文
//        LogRecordContext.putVariable("user", user);
        return user.getId();
    }

    //没用到这个方法
    @Override
    public Long createUser2(UserSaveReqVO reqVO) {
        AdminUserDO user = new AdminUserDO();
        // 映射字段
        user.setUsername(reqVO.getUsername());
        user.setNickname(reqVO.getNickname());
        user.setRemark(reqVO.getRemark());
        user.setDeptId(reqVO.getDeptId());
        user.setEmail(reqVO.getEmail());
        user.setMobile(reqVO.getMobile());
        user.setSex(reqVO.getSex());
        user.setAvatar(reqVO.getAvatar());
        user.setPassword(reqVO.getPassword());
        // 不需要手动设置 createTime 和 updateTime，交给自动填充

        userMapper.insert(user); // MyBatis-Plus 插入，触发填充
        return user.getId();
    }


    /**
     * 对密码进行加密
     *
     * @param password 密码
     * @return 加密后的密码
     */
    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }
}
