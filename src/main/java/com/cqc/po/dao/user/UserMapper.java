package com.cqc.po.dao.user;


import com.cqc.po.domain.user.Role;
import com.cqc.po.domain.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
 /**
     * 通过用户名获取用户信息
     *
     * @param username 用户名
     * @return User 用户信息
     */
    User loadUserByUsername(String username);

    /**
     * 通过用户id获取用户角色集合
     *
     * @param userId 用户id
     * @return List<Role> 角色集合
     */
    List<Role> getUserRolesByUserId(Integer userId);
}
