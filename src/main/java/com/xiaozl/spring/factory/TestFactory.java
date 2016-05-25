package com.xiaozl.spring.factory;

import com.xiaozl.spring.hellworld.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestFactory
 *
 * @author xiaozl
 * @date: 2016/5/25
 */
public class TestFactory {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");
//        Car car1 = (Car) context.getBean("car1");
//        System.out.println(car1);

        Car car2 = (Car) context.getBean("car2");
        System.out.println(car2);
    }
}
