package com.xiaozl.spring.factory;

import com.xiaozl.spring.hellworld.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * StaticCarFactory
 * 静态工厂方法
 * 直接调用某个类的静态方法就可以返回Bean的实例
 * @author xiaozl
 * @date: 2016/5/25
 */
public class StaticCarFactory {

    private static Map<String , Car> cars = new HashMap<String,Car>();

    static {
        cars.put("audi",new Car("W","audi",30000));
        cars.put("bsj",new Car("W","bsj",2000));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
