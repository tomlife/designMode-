package com.fengxun.springboot.demo.test.proxy.staticproxy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 14:27
 * @Version 1.0
 *  代理 对象
 */
public class UserServiceImp   {

    private final UserServiceProxy proxy;

    public UserServiceImp(UserServiceProxy proxy) {
        this.proxy = proxy;

    }
    public int deleteUser(){
        before();
        int i = this.proxy.deleteUser();
        after();
        return i;
    }
    private void  before(){
        System.out.println("真的要删除嘛");
    }
    private void after(){
        System.out.println("你还真给删除 了 ");
    }
}
