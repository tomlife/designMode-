package com.fengxun.springboot.demo.test.designmode.desigfactory.momethodfactory;

import com.fengxun.springboot.demo.test.designmode.desigfactory.FactoryUser;
import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 16:39
 * @Version 1.0
 */
public class SoEasyFactory implements FactoryUser {
    @Override
    public UserFactory onCreate() {
        return new SoEasyUser();
    }
}
