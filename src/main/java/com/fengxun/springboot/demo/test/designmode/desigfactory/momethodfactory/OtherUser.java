package com.fengxun.springboot.demo.test.designmode.desigfactory.momethodfactory;

import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 14:11
 * @Version 1.0
 */
public class OtherUser  implements UserFactory {
    private String name = "其他用户";
    public OtherUser() {

    }

    @Override
    public String getName() {
        return name;
    }

}
