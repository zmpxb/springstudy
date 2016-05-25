package com.xiaozl.spring.hellworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main
 *
 * @author xiaozl
 * @date: 2016/5/9
 *
 * 问题：加载配置文件的时候创建了多少个类的对象？
 */
public class Main {

    public static void main(String[] args) {

        //1.创建spring的IOC容器（ApplicationContext是个接口，代表的的就是spring容器）
        //2.ClassPathXmlApplicationContext表示配置文件在类路径下面
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //3.从IOC容器中获取Bean的实例,实际上就是获取Helloworld类的对象，其中getBean()中的参数就是，beans.xml中某个bean的id的值
        //<bean id="helloWorld" class="com.xiaozl.spring.hellworld.HelloWorld">
        //<property name="userName" value="xiaozl"/>
        //</bean>
        //
//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld1");
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld1");
        //根据类型来获取 bean 的实例: 要求在  IOC 容器中只有一个与之类型匹配的 bean, 若有多个则会抛出异常.
        //一般情况下, 该方法可用, 因为一般情况下, 在一个 IOC 容器中一个类型对应的 bean 也只有一个.
        //HelloWorld helloWorld1 = (HelloWorld) context.getBean(HelloWorld.class);
        // 下面这种方法获取bean要求xml文件中的HelloWorld类型的bean唯一
        //HelloWorld helloWorld1 = (HelloWorld) context.getBean(HelloWorld.class);

        Car car1 = (Car) context.getBean("car1");
        context.close();
        System.out.println(car1.toString());
    }

}
