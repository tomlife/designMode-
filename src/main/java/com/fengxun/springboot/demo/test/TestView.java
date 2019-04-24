package com.fengxun.springboot.demo.test;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/18 14:31
 * @Version 1.0
 */
public final class TestView {
    private static TestView2 testView = new TestView2();
    public TestView() {
        System.out.println("构造");
    }

    static {
        System.out.println(" static 进行操作  ");
    }
}
