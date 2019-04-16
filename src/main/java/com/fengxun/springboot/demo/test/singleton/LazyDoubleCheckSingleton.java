package com.fengxun.springboot.demo.test.singleton;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/16 13:27
 * @Version 1.0
 * 懒汉式  单例:  添加锁机制
 * 优点 : 多线程下依然可以保持单例
 * 缺点 : 由于加锁 导致 效率变低
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazy_double_check_singleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public final static LazyDoubleCheckSingleton getInstance() {
        synchronized (LazyDoubleCheckSingleton.class) {
            if (lazy_double_check_singleton == null) {
                lazy_double_check_singleton = new LazyDoubleCheckSingleton();
            }
            return lazy_double_check_singleton;
        }
    }

    public final static synchronized LazyDoubleCheckSingleton getStaticInstance() {
        if (lazy_double_check_singleton == null) {
            lazy_double_check_singleton = new LazyDoubleCheckSingleton();
        }
        return lazy_double_check_singleton;
    }

}
