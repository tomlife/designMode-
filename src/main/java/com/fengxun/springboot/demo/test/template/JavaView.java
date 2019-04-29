package com.fengxun.springboot.demo.test.template;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/29 10:33
 * @Version 1.0
 */
public class JavaView extends View {

    @Override
    protected void setLayout() {
        System.out.println("java 的 设置layout方式");
    }

    @Override
    protected void initDraw() {
        System.out.println("java 绘制方式");
    }

    @Override
    protected void initView() {
        System.out.println("java initView ");
    }

    @Override
    protected void initContext() {
        System.out.println("java Context");
    }

}
