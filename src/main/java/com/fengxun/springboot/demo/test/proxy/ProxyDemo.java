package com.fengxun.springboot.demo.test.proxy;

import com.fengxun.springboot.demo.test.proxy.dynamicproxy.DynamicJDKUserServiceProxy;
import com.fengxun.springboot.demo.test.proxy.staticproxy.*;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 14:24
 * @Version 1.0
 */
public class ProxyDemo {
    public static void main(String[] args) {
        /**
         * 静态代理方式
         */
        RootProxy rootProxy = new RootProxy(new OtherProxy());
        rootProxy.add();
        System.out.println("------------------------------------分隔符---------------------------------------------");
        UserServiceImp userServiceImp = new UserServiceImp(new UserDao());
        userServiceImp.deleteUser();
        System.out.println("------------------------------------***分隔符***---------------------------------------------");
        UserServiceProxy instance = (UserServiceProxy) new DynamicJDKUserServiceProxy().getInstance(new UserDao());
        instance.deleteUser();

        char ca = 12 ;
        System.out.println(ca);



    }
}
