package com.xiaozl.spring.hellworld;

/**
 * HelloWorld
 *
 * @author xiaozl
 * @date: 2016/5/9
 */
public class HelloWorld {

    private String userName;

    public HelloWorld() {
        System.out.println("HelloWorld's constructor...");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("setUser:" + userName);
        this.userName = userName;
    }

    public HelloWorld(String userName) {
        this.userName = userName;
    }

    public void hello(){
        System.out.println("Hello: " + userName);
    }

}
