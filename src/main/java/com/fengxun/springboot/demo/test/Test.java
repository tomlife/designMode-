package com.fengxun.springboot.demo.test;

import com.fengxun.springboot.demo.test.simple.JavaCourse;

import java.lang.reflect.Constructor;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/11 15:00
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws  Exception {
        Class<?> clazz = Class.forName("com.fengxun.springboot.demo.test.simple.JavaCourse");
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance();
        Object o1 = declaredConstructor.newInstance();
        System.out.println("(o1 == o)  = " + (o1 == o) );

    }
}

class ThreadExecute implements Runnable {
    @Override
    public void run() {
        System.out.println("instance = " + JavaCourse.getInstance());
    }
}