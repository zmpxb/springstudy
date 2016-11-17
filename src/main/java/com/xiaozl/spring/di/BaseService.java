package com.xiaozl.spring.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiaozl on 2016/5/30.
 */
public class BaseService<T> {

    // 如果没有在public class BaseService<T> 上面加注解，@Autowired可以被子类继承，好比我们工作室的AbstractController
    @Autowired
    protected BaseRepository<T> repository;

    public void add(){
        System.out.println("add ......");
        System.out.println(repository);
    }

}
