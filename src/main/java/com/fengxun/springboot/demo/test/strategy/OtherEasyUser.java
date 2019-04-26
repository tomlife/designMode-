package com.fengxun.springboot.demo.test.strategy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 11:53
 * @Version 1.0
 */

public class OtherEasyUser extends AbsUserPay{

    public OtherEasyUser(String uuid, String orderId, double amoun) {
        this.uuid = uuid;
        this.orderId = orderId;
        this.amoun = amoun;
    }
}
