package com.ymxdclass.user.service.impl;

import com.ymxdclass.user.service.UserService;
//import org.apache.dubbo.config.annotation.Service;
//
//@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    public String sayHello(String name) {
        return "hello this is yummy"+name;
    }
}
