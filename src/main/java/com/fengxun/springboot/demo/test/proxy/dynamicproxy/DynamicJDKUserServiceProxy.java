package com.fengxun.springboot.demo.test.proxy.dynamicproxy;

import com.fengxun.springboot.demo.test.proxy.staticproxy.UserServiceProxy;
import sun.misc.ProxyGenerator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 14:57
 * @Version 1.0
 */
public class DynamicJDKUserServiceProxy implements InvocationHandler   {
    private UserServiceProxy proxy;
    public Object getInstance(UserServiceProxy proxy){
        this.proxy= proxy;
        /**
         * 参数1 : 需要代理的对象的 类加载器
         * 参数2 : 被代理类的接口
         * 参数3 : 代理对象
         */
        return Proxy.newProxyInstance(proxy.getClass().getClassLoader(),proxy.getClass().getInterfaces(),this);
    }




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" 自定义  之前");

        Object invoke = method.invoke(this.proxy,args);
        System.out.println(" 自定义  之后");
        return invoke;
    }


}
