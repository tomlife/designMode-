package com.fengxun.springboot.demo.test.strategy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 16:04
 * @Version 1.0
 */
public abstract class AbsUserPay implements Pay {
    protected String uuid;
    protected String orderId;
    protected double amoun;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmoun() {
        return amoun;
    }

    public void setAmoun(double amoun) {
        this.amoun = amoun;
    }

    @Override
    public PayState pay() {
        AbsSuperPay pay = PayFactory.getPay();
        return pay.pay(getUuid(), getAmoun());

    }

    @Override
    public PayState pay(String payKey, double amoun) {
        System.out.println("准备开始支付....");
        AbsSuperPay pay = PayFactory.getPay(payKey);
        System.out.println("欢迎使用".concat(pay.getName()).concat("支付"));
        System.out.println("交易金额为:" + amoun + "元");
        return pay.pay(getUuid(), amoun);
    }
}
