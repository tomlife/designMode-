package com.fengxun.springboot.demo.test.designmode.desigfactory.absfactory;

import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 11:24
 * @Version 1.0
 */
public class SoEasyUser implements AddUser ,EditUser {
    private String name = "停简单用户";

    public SoEasyUser() {

    }

    public String getName() {
        return name;
    }


    @Override
    public void add() {
        System.out.println( "添加 ==  " + getName());
    }

    @Override
    public void edit() {
        System.out.println( "编辑 ==  " + getName());
    }
}
