package com.fengxun.springboot.demo.test.designmode.desigfactory.soeasyfactory;

import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 11:25
 * @Version 1.0
 * 此工厂为  简单方法工厂
 */
public class FactoryUser1 {

    public UserFactory onCreate(String userName) {
        if (userName == null) {
            throw new NullPointerException("别给空的");
        }
        if (userName.contains("简单")) {
            return new SoEasyUser();
        } else if (userName.contains("其他")) {
            return new OtherUser();
        } else {
            return null;
        }
    }

}
