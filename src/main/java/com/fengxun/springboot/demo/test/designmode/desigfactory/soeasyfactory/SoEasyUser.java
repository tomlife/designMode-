package com.fengxun.springboot.demo.test.designmode.desigfactory.soeasyfactory;

import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 11:24
 * @Version 1.0
 */
public class SoEasyUser  implements UserFactory {
    private String name = "停简单用户";

    public SoEasyUser() {
        System.out.println(name);
    }

    @Override
    public String getName() {
        return name;
    }

}
