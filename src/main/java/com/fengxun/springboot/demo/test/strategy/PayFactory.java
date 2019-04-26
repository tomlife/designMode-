package com.fengxun.springboot.demo.test.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 14:24
 * @Version 1.0
 */
public final class PayFactory {
    private static Map<String, AbsSuperPay> map;

    private PayFactory() {
    }

    static {
        map = new HashMap<>();
        map.put(PayKey.JD_PAY, new JDPay());
        map.put(PayKey.ALI_PAY, new AliBaBaPay());
        map.put(PayKey.YIN_LIAN_PAY, new YinLianPay());
        map.put(PayKey.WEI_XIN_PAY, new WeiXinPay());
    }

    public static AbsSuperPay getPay() {
        return map.get(PayKey.ALI_PAY);
    }

    public static AbsSuperPay getPay(String payKey) {
        if (!map.containsKey(payKey)) {
            return map.get(PayKey.ALI_PAY);
        }
        return map.get(payKey);
    }

    public interface PayKey {
        String JD_PAY = "京东";
        String ALI_PAY = "阿里";
        String YIN_LIAN_PAY = "银联";
        String WEI_XIN_PAY = "微信";
        String DEFAULT_PAY = ALI_PAY;
    }
}
