package com.pxie.example.user;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @author pxie
 * @version 1.0
 * @data 2018/8/8 0008 11
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setApplication(new ApplicationConfig("user-dubbo-provider"));
        serviceConfig.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(new UserServiceImpl());
        serviceConfig.setVersion("1.0");
        serviceConfig.export();

        System.in.read();
    }
}
