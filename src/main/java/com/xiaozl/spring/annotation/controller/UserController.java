package com.xiaozl.spring.annotation.controller;

import com.xiaozl.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by xiaozl on 2016/5/25.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void execute(){
        System.out.println("user Controller execute");
        userService.add();
    }

    /*

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    等价于

    @Autowired
    private UserService userService;

    如果UserService有多个实现类
        @Autowired
        @Qualifiter("userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    或者
            @Autowired

    public void setUserService(@Qualifiter("userService") UserService userService) {
        this.userService = userService;
    }
    */
}
