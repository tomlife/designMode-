package com.fengxun.springboot.demo.test.proxy.staticproxy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 14:16
 * @Version 1.0
 */
public class RootProxy implements IProxy   {
    private IProxy proxy;
    public RootProxy(IProxy proxy) {
        this.proxy = proxy;
    }


    /**
     * 前置通知
     */
    public void before(){
        System.out.println(" 判断是否 是有效数据 再让你 接着进行 ");
    }

    /**
     *
     */
    public void after(){
        System.out.println(" 判断之后的 内容 ");
    }

    @Override
    public void update() {
        before();
        this.proxy.update();
        after();
    }
}
