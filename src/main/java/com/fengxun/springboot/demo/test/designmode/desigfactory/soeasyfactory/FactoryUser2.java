package com.fengxun.springboot.demo.test.designmode.desigfactory.soeasyfactory;

import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 11:25
 * @Version 1.0
 * 此工厂为  简单方法工厂  通过反射技术 创建对象  在入参中首先规定好 传入的内容必须是 父接口的实现类 或者接口
 */
public class FactoryUser2 {

    public UserFactory onCreate(Class<? extends UserFactory> clazz) {
        if (clazz == null) {
            throw new NullPointerException("别给空的");
        }
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
