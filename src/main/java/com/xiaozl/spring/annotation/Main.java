package com.xiaozl.spring.annotation;

import com.xiaozl.spring.annotation.controller.UserController;
import com.xiaozl.spring.annotation.repository.UserRepository;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaozl on 2016/5/25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");

        TestObject to = (TestObject) context.getBean("testObject");
        System.out.println(to);

        UserController userController = (UserController) context.getBean("userController");
        userController.execute();
        System.out.println(userController);

        // 像这种接口和实现如果@Repository没有指定名称，则bean的名字是实现类的名字，在这里要用(UserRepository) context.getBean("userRepositoryImpl");
        UserRepository userRepository = (UserRepository) context.getBean("userRepository"); // 指定了@Repository("userRepository")
        System.out.println(userRepository);
    }
}
