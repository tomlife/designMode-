package com.fengxun.springboot.demo.test.designmode.desigfactory.absfactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 17:28
 * @Version 1.0
 *  这里是抽象工厂 设计模式
 */
public interface UserBehavior {
    /**
     * 抽象 结构  使其 实现不依赖于上层
     */
    AddUser createAdd();
    EditUser createEdit();
}
