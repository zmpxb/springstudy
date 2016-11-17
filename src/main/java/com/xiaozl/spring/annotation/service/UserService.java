package com.xiaozl.spring.annotation.service;

import com.xiaozl.spring.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaozl on 2016/5/25.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void add(){
        System.out.println("UserService add ..");
        userRepository.save();
    }
}
