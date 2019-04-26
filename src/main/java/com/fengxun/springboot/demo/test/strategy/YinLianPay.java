package com.fengxun.springboot.demo.test.strategy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 14:10
 * @Version 1.0
 */
public class YinLianPay extends AbsSuperPay {

    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double queryBalance(String uuid) {
        return 500;
    }
}
