package com.xiaozl.spring.factorybean;

import com.xiaozl.spring.hellworld.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * CarFactoryBean
 * 需要实现spring的FactoryBean这个接口
 * @author xiaozl
 * @date: 2016/5/25
 */
public class CarFactoryBean implements FactoryBean {

    private String brand;

    public void setBrand(String brand){
        // 在beans-factorybean中bean配置的属性会影响到这属性，就是通过setter配置属性
        this.brand = brand;
    }

    /**
     * 返回一个bean的对象
     * 决定了context.getBean("car") 获取的到底是什么对象
     * @return
     * @throws Exception
     */
    public Object getObject() throws Exception {
        // 这里的属性可以全部用 set方法来配置
        return new Car(brand,"audi",30000);
    }

    /**
     * 返回bean的类型
     * @return
     */
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * 是否是单例
     * @return
     */
    public boolean isSingleton() {
        return false;
    }
}
