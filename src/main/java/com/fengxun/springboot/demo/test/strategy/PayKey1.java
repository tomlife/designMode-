package com.fengxun.springboot.demo.test.strategy;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 16:08
 * @Version 1.0
 */
public enum PayKey1 {
    JD_PAY ,ALI_PAY,YIN_LIAN_PAY ,WEI_XIN_PAY ;

    private String jdpay ="京东";
    public String getJdpay(){
        return jdpay;
    }

  private String alpay ="阿里";
    public String getAlpay(){
        return alpay;
    }

  private String ylpay ="银联";
    public String getYlpay(){
        return ylpay;
    }

  private String wxpay ="微信";
    public String getWxpay(){
        return wxpay;
    }



}
