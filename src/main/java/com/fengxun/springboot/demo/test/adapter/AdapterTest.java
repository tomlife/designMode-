package com.fengxun.springboot.demo.test.adapter;

import java.util.List;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/29 13:26
 * @Version 1.0
 * 适配器 模式是一个 一对多的 他可以支持很种, 就像 电源插座一样 可以支持多种插头
 */

public class AdapterTest {

    public static void main(String[] args) {
        /**
         * 不仅支持USB3.0 还支持USB2.0
         */
        PC pc = new PC();
        pc.getUsb2Type();
        pc.getUsb3Type();

    }

}
