package com.ymxdclass.user.controller;

import com.ymxdclass.user.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
//    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return userService.sayHello("hhhh");
    }
}
