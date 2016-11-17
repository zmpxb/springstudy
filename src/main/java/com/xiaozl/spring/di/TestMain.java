package com.xiaozl.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaozl on 2016/5/30.
 */
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-generic.xml");

        UserService userService = (UserService)context.getBean("userService");
        userService.add();
    }

}
