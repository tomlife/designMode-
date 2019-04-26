package com.fengxun.springboot.demo.test.strategy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 14:47
 * @Version 1.0
 */
public abstract class AbsSuperPay  implements Pay {

    public abstract String getName();

    public abstract double queryBalance(String uuid);


    @Override
    public PayState pay(String uuid, double number) {
        if (queryBalance(uuid) < number) {
            return new PayState("大兄弟你钱钱不够了", 400, -1);
        }
        return new PayState("支付成功", 200, 1);
    }

    @Override
    public PayState pay() {
        return null;
    }
}
