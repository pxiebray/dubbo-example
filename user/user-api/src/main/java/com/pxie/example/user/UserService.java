package com.pxie.example.user;

import com.pxie.example.user.vo.UserInfo;

/**
 * @author Administrator
 * @version 1.0
 * @data 2018/8/8 0008 47
 */
public interface UserService {

    /**
     * 添加用户信息
     * @param userInfo
     * @return
     */
    void add(UserInfo userInfo);

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    UserInfo get(Long id);

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    void update(UserInfo userInfo);

}
