package com.fengxun.springboot.demo.test.singleton;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/16 13:36
 * @Version 1.0
 * 懒汉 单例模式 :
 * 优点 : 提高性能(相对于加锁来说) 保证多线程下也是单例  .巧妙地避免了线程安全问题
 * 缺点 : 个人目前没有发现 觉得这种方式比较好, 如果要说非要说缺点的话,那就是多创建了一个对象,由内部类直接加载的
 */
public class LazyHolderSingleton {
    private LazyHolderSingleton() {
        if (LazyHolder.lazyHolderSingleton != null) {
            throw new RuntimeException("这个对象 已经创建过了");
        }
    }

    public static LazyHolderSingleton getInstance() {
        return LazyHolder.lazyHolderSingleton;
    }


    private static class LazyHolder {
        public LazyHolder() {
        }

        private static final LazyHolderSingleton lazyHolderSingleton = new LazyHolderSingleton();
    }
}
