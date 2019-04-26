package com.fengxun.springboot.demo.test.delegate;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/24 18:00
 * @Version 1.0
 */
public class LabourDuDuZui implements Labour{

    @Override
    public void code(String code) {
        System.out.println("嘟嘟嘴 写 " + code);
    }
}
