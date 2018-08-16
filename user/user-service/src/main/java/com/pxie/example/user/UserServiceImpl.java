package com.pxie.example.user;

import com.pxie.example.user.vo.UserInfo;

/**
 * @author pxie
 * @version 1.0
 * @data 2018/8/8 0008 06
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add(UserInfo userInfo) {
        System.out.println("add User " + userInfo.toString());
    }

    @Override
    public UserInfo get(Long id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setIcon("http://icon.jpg");
        userInfo.setName("user" + id);
        userInfo.setDesc("desc" + id);
        return userInfo;
    }

    @Override
    public void update(UserInfo userInfo) {
        System.out.println("update User " + userInfo.toString());
    }
}
