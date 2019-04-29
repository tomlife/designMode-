package com.fengxun.springboot.demo.test.adapter;

import java.util.List;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/29 10:52
 * @Version 1.0
 */
public class PC  implements  Usb3Adapter,Usb2Adapter{


    @Override
    public void getUsb2Type() {
        System.out.println("USB 2.0");
    }

    @Override
    public void getUsb3Type() {
        System.out.println("USB 3.0");

    }
}
