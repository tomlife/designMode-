package com.fengxun.springboot.demo.test.singleton;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 11:35
 * @Version 1.0
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal = new ThreadLocal<ThreadLocalSingleton>(){

        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingletonThreadLocal.get();
    }

                         



    





}
