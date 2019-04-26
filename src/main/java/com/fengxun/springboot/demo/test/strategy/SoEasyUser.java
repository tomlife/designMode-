package com.fengxun.springboot.demo.test.strategy;

import com.fengxun.springboot.demo.test.designmode.desigfactory.FactoryUser;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 11:53
 * @Version 1.0
 */

public class SoEasyUser  extends AbsUserPay {

    public SoEasyUser(String uuid, String orderId, double amoun) {
        this.uuid = uuid;
        this.orderId = orderId;
        this.amoun = amoun;
    }
}
