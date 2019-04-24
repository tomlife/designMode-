package com.fengxun.springboot.demo.test.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/24 10:54
 * @Version 1.0
 */
public class CgligTest {
    public static void main(String[] args) {
        String key = DebuggingClassWriter.DEBUG_LOCATION_PROPERTY;
        String value = "E:/cglib_proxy_class/";
        System.setProperty(key, value);
        JJCglibMeipo JJCglibMeipo = new JJCglibMeipo();
        CustomPerson instance = (CustomPerson) JJCglibMeipo.getInstance(CustomPerson.class);
        instance.findLove();



    }
}
