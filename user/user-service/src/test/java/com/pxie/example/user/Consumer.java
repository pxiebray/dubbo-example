package com.pxie.example.user;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.pxie.example.user.vo.UserInfo;

/**
 * @author pxie
 * @version 1.0
 * @data 2018/8/8 0008 11
 */
public class Consumer {
    public static void main(String[] args) {
        ReferenceConfig<UserService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(new ApplicationConfig("user-dubbo-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
        referenceConfig.setInterface(UserService.class);
        referenceConfig.setVersion("1.0");
        UserService userService = referenceConfig.get();

        UserInfo info = userService.get(1L);
        System.out.println(info.toString());
        userService.add(info);
        userService.update(info);
    }
}
