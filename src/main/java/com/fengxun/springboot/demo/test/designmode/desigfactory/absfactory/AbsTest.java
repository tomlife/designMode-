package com.fengxun.springboot.demo.test.designmode.desigfactory.absfactory;


import com.fengxun.springboot.demo.test.designmode.desigfactory.FactoryUser;
import com.fengxun.springboot.demo.test.strategy.PayKey1;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 17:39
 * @Version 1.0
 */
public class AbsTest {
    public static void main(String[] args) {
        System.out.println("抽象工厂 设计模式");


        SoEasyFactory soEasyUser1  = new SoEasyFactory();
        soEasyUser1.createAdd().add();
        soEasyUser1.createEdit().edit();
        OtherUserFactory otherUserFactory = new OtherUserFactory();
        otherUserFactory.createAdd().add();
        otherUserFactory.createEdit().edit();
    }
}
