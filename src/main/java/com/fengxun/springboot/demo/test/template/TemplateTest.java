package com.fengxun.springboot.demo.test.template;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/29 10:33
 * @Version 1.0
 *  模板思想 是基于 流程 主干不变 分支不同
 *           不管什么分支去实现  但最终的流程是相同的
 */
public class TemplateTest {
    public static void main(String[] args) {
        JavaView javaView = new JavaView();
        javaView.onCreate();
        PythonView pythonView = new PythonView();
        pythonView.onCreate();
        int err = 2;
        System.out.println(err%5);
    }
}
