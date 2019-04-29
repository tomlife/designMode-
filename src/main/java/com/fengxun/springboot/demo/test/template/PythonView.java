package com.fengxun.springboot.demo.test.template;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/29 10:33
 * @Version 1.0
 */
public class PythonView extends View {

    @Override
    protected void setLayout() {
        System.out.println("python 设置布局 方式");
    }

    @Override
    protected void initDraw() {
        System.out.println("python 绘制方式");
    }

    @Override
    protected void initView() {
        System.out.println("PythonView initView ");
    }

    @Override
    protected void initContext() {
        System.out.println("PythonView Context");
    }

}
