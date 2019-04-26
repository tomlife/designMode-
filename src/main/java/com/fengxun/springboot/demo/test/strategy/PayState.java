package com.fengxun.springboot.demo.test.strategy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 14:12
 * @Version 1.0
 */
public class PayState {
    private String msg;
    private int code;
    private int payState;

    public PayState(String msg, int code, int payState) {
        this.msg = msg;
        this.code = code;
        this.payState = payState;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", payState=" + payState +
                '}';
    }
}
