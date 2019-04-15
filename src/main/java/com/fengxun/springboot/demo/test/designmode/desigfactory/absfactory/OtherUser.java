package com.fengxun.springboot.demo.test.designmode.desigfactory.absfactory;

import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 14:11
 * @Version 1.0
 */
public class OtherUser   implements AddUser,EditUser {
    private String name = "其他用户";
    public OtherUser() {
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
