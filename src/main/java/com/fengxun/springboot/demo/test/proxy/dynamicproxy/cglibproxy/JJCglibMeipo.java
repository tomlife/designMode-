package com.fengxun.springboot.demo.test.proxy.dynamicproxy.cglibproxy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/19 17:21
 * @Version 1.0
 */
public class JJCglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }
    private void before() {System.out.println("最开始");
    }
    private void after() {System.out.println("最后的");
    }

}
