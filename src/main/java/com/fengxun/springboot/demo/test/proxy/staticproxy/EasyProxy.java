package com.fengxun.springboot.demo.test.proxy.staticproxy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 14:13
 * @Version 1.0
 */
public class EasyProxy implements IProxy {

    @Override
    public void update() {
        System.out.println(" 停简单 被代理的  用户的  方法 ");
    }
}
