package com.xiaowen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yulichang.base.MPJBaseMapper;
import com.xiaowen.entity.AdminUserDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

/**
 * BaseMapperX在 MyBatis Plus 的 BaseMapper 的基础上拓展，提供更多的能力
 *
 * 1. {@link BaseMapper} 为 MyBatis Plus 的基础接口，提供基础的 CRUD 能力
 * 2. {@link MPJBaseMapper} 为 MyBatis Plus Join 的基础接口，提供连表 Join 能力
 */
public interface AdminUserMapper extends BaseMapper<AdminUserDO>{
    @Insert("INSERT INTO users(username, password) VALUES(#{username}, #{password})")
    void insertUser(AdminUserDO user);

    @Select("SELECT * FROM users WHERE username = #{username}")
    Optional<AdminUserDO> findByUsername(String username);
}
