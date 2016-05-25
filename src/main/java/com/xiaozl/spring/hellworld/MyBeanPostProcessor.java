package com.xiaozl.spring.hellworld;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * MyBeanPostProcessor
 *
 * @author xiaozl
 * @date: 2016/5/24
 */
public class MyBeanPostProcessor implements BeanPostProcessor{

    /**
     * 任何bean的初始化都会经过这个处理器，前提是要在bean.xml中配置
     * 可以添加过滤对指定的bean进行处理
     * @param bean 指的就是创建的bean
     * @param beanName 指的是创建的bean的id
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化前处理"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化后处理"+beanName);
        // 返回的这个bean供 context.getBean 使用
//        Car car = new Car();
//        car.setBrand("xiao");
        return bean;
    }
}
