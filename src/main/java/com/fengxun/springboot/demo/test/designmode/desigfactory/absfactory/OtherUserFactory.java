package com.fengxun.springboot.demo.test.designmode.desigfactory.absfactory;

import com.fengxun.springboot.demo.test.designmode.desigfactory.FactoryUser;
import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 16:40
 * @Version 1.0
 */
public class OtherUserFactory implements UserBehavior {


    @Override
    public AddUser createAdd() {
        return new OtherUser();
    }

    @Override
    public EditUser createEdit() {
        return new OtherUser();
    }
}
