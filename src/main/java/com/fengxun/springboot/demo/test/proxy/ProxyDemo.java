package com.fengxun.springboot.demo.test.proxy;

import com.fengxun.springboot.demo.test.TestView;
import com.fengxun.springboot.demo.test.proxy.dynamicproxy.DynamicJDKUserServiceProxy;
import com.fengxun.springboot.demo.test.proxy.dynamicproxy.cglibproxy.JJCglibMeipo;
import com.fengxun.springboot.demo.test.proxy.dynamicproxy.manualproxy.JJDynamicJDKUserServiceProxy;
import com.fengxun.springboot.demo.test.proxy.staticproxy.*;

import java.lang.reflect.Constructor;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 14:24
 * @Version 1.0
 */
public class ProxyDemo {
    public static void main(String[] args) throws Exception {
        /**
         * 静态代理方式
         */
        EasyProxy easyProxy = new EasyProxy();
        OtherProxy otherProxy = new OtherProxy();
        RootProxy rootProxy = new RootProxy(easyProxy);
        rootProxy.update();
        System.out.println("------------------------------------分隔符---------------------------------------------");
        UserServiceImp userServiceImp = new UserServiceImp(new UserDao());
        userServiceImp.deleteUser();
        System.out.println("------------------------------------***分隔符***---------------------------------------------");
        UserServiceProxy instance = (UserServiceProxy) new DynamicJDKUserServiceProxy().getInstance(new UserDao());
        instance.deleteUser();

        char ca = 12;
        System.out.println(ca);
        JJCglibMeipo JJCglibMeipo = new JJCglibMeipo();
        UserDao instance1 = (UserDao) JJCglibMeipo.getInstance(UserDao.class);


        instance1.deleteUser();
        //   deleteUser()  this.h.invoke(


/*      System.out.println(" 准备开始写对象");
        String clazzName = "$Proxy0";
        byte[] bytes = ProxyGenerator.generateProxyClass(clazzName, new Class[]{UserDao.class});
        FileOutputStream fileOutputStream = new FileOutputStream(new File("$Proxy0.class"));
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();*/

        System.out.println(" 自己  半 复制 半手写");
        JJDynamicJDKUserServiceProxy jjDynamicJDKUserServiceProxy = new JJDynamicJDKUserServiceProxy();
        UserServiceProxy instance2 = (UserServiceProxy) jjDynamicJDKUserServiceProxy.getInstance(new UserDao());
        instance2.deleteUser();


    }

    public static void printf() throws Exception {
        Class<?> clazz = Class.forName(TestView.class.getName());
        Constructor<?> constructor = clazz.getConstructor();
        constructor.newInstance();
    }
}
