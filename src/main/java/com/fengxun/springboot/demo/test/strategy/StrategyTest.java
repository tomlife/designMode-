package com.fengxun.springboot.demo.test.strategy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 17:20
 * @Version 1.0
 */
public class StrategyTest {
    public static void main(String[] args) {
        String uuid = "650";
        String orderid = "";
        double amoun = 300; // 只有100快
        OtherEasyUser otherEasyUser = new OtherEasyUser(uuid, orderid, amoun);
//      PayState pay = otherEasyUser.pay();
        PayState pay = otherEasyUser.pay(PayFactory.PayKey.JD_PAY,amoun);
        System.out.println(pay.toString());
    }
}
