package com.fengxun.springboot.demo.test.strategy;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/26 11:53
 * @Version 1.0
 */
public interface Pay {

    PayState pay();
    PayState pay(String uuid, double number) ;
}
