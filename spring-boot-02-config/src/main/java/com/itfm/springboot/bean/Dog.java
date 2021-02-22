package com.itfm.springboot.bean;

/**
 * @ProjectName: spring-boot-02-config
 * @Package: com.itfm.springboot.bean
 * @ClassName: Dog
 * @Author: frankman
 * @Description:
 * @Date: 2021/2/22 15:57
 * @Version: 1.0
 */

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/22 15:57
 */
public class Dog {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

