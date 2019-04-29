package com.fengxun.springboot.demo.test;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/18 14:31
 * @Version 1.0
 */
public class TestView {
    public   int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TestView(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestView{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

}
