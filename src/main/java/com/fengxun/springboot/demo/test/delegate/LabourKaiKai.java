package com.fengxun.springboot.demo.test.delegate;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/24 18:00
 * @Version 1.0
 */
public class LabourKaiKai implements Labour {
    public int num = 0;

    @Override
    public void code(String code) {
        num++;
        System.out.println( num + " 凯凯写  " + code);
    }
}
