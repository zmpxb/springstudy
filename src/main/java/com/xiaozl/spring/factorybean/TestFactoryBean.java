package com.xiaozl.spring.factorybean;

import com.xiaozl.spring.hellworld.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestFactoryBean
 *
 * @author xiaozl
 * @date: 2016/5/25
 */
public class TestFactoryBean {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factorybean.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }

}
