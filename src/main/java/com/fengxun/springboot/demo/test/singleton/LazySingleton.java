package com.fengxun.springboot.demo.test.singleton;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/16 11:47
 * @Version 1.0
 * 懒汉式 单例 :
 *             优点 : 时间换空间  需要的时候进行创建 节省内存
 *             缺点 : 效率低,且 没有任何锁机制 多线程情况下 不建议使用
 *
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    /**
     *  当多线程情况下  Thread 1  , Thread 2
     *               当Thread1 进入到  if (lazySingleton == null)的时候,
     *               Thread2 拿到执行权,这是还没有执行LazySingleton构造也就是还没有创建对象
     *               Thread2 new LazySingleton(),接着执行.
     *               Thread1 又拿到执行权 会接着上次执行的if条件内开始执行, 又开始创建对象, 创建2次 所以线程不安全
     *
     * @return
     */
    public static final LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
