package com.fengxun.springboot.demo.test.delegate;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/24 18:07
 * @Version 1.0
 * 委派模式 测试代码
 */
public class DelegateTest {
    public static void main(String[] args) {
        BigBoss bigBoss = new BigBoss();
        bigBoss.labour(new Boss(), "ios");
        bigBoss.labour(new Boss(), "java");
        bigBoss.labour(new Boss(), "ios");


    }
}
