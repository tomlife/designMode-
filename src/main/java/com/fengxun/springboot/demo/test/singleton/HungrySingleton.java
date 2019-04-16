package com.fengxun.springboot.demo.test.singleton;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/16 11:07
 * @Version 1.0
 * 饿汉式 单例  优点 :  单线程下保持单例 .  空间换时间 效率高(加载此对象的时候就已经初始化了) 所以当getInstance的时候就直接 使用了
 *              缺点 : 浪费内存 在没有getInstance的时候 就加载到内存中了,  此对象是不安全的---> 可以通过反射修改此对象
 *
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton= new HungrySingleton();
    private HungrySingleton() {
    }

    /**
     * 对于 此方法 加 final 是为了 防止被 继承的时候 被重写
     * @return
     */
    public final static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
