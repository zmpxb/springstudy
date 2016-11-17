package com.xiaozl.spring.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by xiaozl on 2016/5/25.
 */
@Repository(value = "userRepository")
public class UserRepositoryImpl implements  UserRepository{
    // 这里的注解@Repository 其实是value= "userRepository"
    public void save() {
        System.out.println("userRepository save");
    }
}
