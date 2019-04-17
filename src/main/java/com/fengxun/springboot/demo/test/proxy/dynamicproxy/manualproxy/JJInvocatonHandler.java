package com.fengxun.springboot.demo.test.proxy.dynamicproxy.manualproxy;

import java.lang.reflect.Method;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 17:09
 * @Version 1.0
 */
public interface JJInvocatonHandler {
    Object invoke(Object object, Method method, Object[] ags) throws Throwable;
}
