package com.fengxun.springboot.demo.test.proxy.staticproxy;

import java.io.Serializable;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 14:27
 * @Version 1.0
 * 被代理对象
 */
public class UserDao  implements UserServiceProxy   {

    @Override
    public int deleteUser() {
        System.out.println("我反手就是一个 delete  ");
        return 0;
    }
}
