package com.fengxun.springboot.demo.test.designmode.desigfactory;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/15 11:23
 * @Version 1.0
 * 工厂的顶层接口 : 遵循开闭原则  :  1. 对外开放扩展
 * 2. 对外关闭修改  提高复用和维护
 * : 强调 通过抽象构建框架     通过扩展实现细节
 *   缺点 : 工厂类的职责过重, 对于复杂的逻辑业务不易于扩展
 */
public interface UserFactory {
    String getName();
}
