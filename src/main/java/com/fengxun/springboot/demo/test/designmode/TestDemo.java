package com.fengxun.springboot.demo.test.designmode;

import com.fengxun.springboot.demo.test.designmode.desigfactory.momethodfactory.FactoryUser1;
import com.fengxun.springboot.demo.test.designmode.desigfactory.momethodfactory.FactoryUser2;
import com.fengxun.springboot.demo.test.designmode.desigfactory.soeasyfactory.OtherUser;
import com.fengxun.springboot.demo.test.designmode.desigfactory.soeasyfactory.SoEasyUser;
import com.fengxun.springboot.demo.test.designmode.desigfactory.UserFactory;

import javax.print.attribute.standard.MediaSize;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 14:15
 * @Version 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        // 工厂模式 易于扩展  ,缺点 新添加 扩展类成员的话需要 重写 父接口中的所有内容
        UserFactory soEasyUser = new SoEasyUser();
        String name = soEasyUser.getName();
        System.out.println(name);

        FactoryUser1 factoryUser1 = new FactoryUser1();
        name = factoryUser1.onCreate("其他").getName();
        System.out.println(name);


        FactoryUser2 factoryUser2 = new FactoryUser2();
        String name1 = factoryUser2.onCreate(SoEasyUser.class).getName();
        System.out.println(name1);
        UserFactory userFactory = factoryUser2.onCreate(OtherUser.class);
        System.out.println(userFactory.getName());
    }
}
