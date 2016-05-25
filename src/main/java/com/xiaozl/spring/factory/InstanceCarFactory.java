package com.xiaozl.spring.factory;

import com.xiaozl.spring.hellworld.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * InstanceCarFactory
 * 实例工厂的方法：需要先创建工厂本身（先创建InstanceCarFactory的对象instanceCarFactory的实例,
 * 静态工厂方法不用这样），再调用工厂的实例方法来返回bean的实例
 * @author xiaozl
 * @date: 2016/5/25
 */
public class InstanceCarFactory {

    private static Map<String , Car> cars = null;

    public InstanceCarFactory(){
        cars = new HashMap<String,Car>();
        cars.put("audi",new Car("W","audi",30000));
        cars.put("fute",new Car("ford","fute",2000));
    }

    public Car getCar(String name){
        return cars.get(name);
    }
}

