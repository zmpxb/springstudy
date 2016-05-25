package com.xiaozl.spring.hellworld;

import org.springframework.beans.factory.FactoryBean;

/**
 * Person
 *
 * @author xiaozl
 * @date: 2016/5/11
 */
public class Person {

    private String personName;

    private Car car;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}

