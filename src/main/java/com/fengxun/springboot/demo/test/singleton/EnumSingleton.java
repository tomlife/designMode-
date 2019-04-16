package com.fengxun.springboot.demo.test.singleton;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/16 17:01
 * @Version 1.0
 */
public enum EnumSingleton {
    SINGLETON;;
    private HungrySingleton hungrySingleton;

    public HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }

    public static EnumSingleton getInstance() {
        return SINGLETON;
    }

}
