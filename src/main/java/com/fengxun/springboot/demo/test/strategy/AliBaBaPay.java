package com.fengxun.springboot.demo.test.strategy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 11:57
 * @Version 1.0
 */
public class AliBaBaPay  extends  AbsSuperPay {
    @Override
    public String getName() {
        return "阿里巴巴支付";
    }

    @Override
    public double queryBalance(String uuid) {
        return 6000;
    }
}
