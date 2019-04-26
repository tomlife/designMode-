package com.fengxun.springboot.demo.test.proxy.dynamicproxy.cglibproxy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/24 10:54
 * @Version 1.0
 */
public class CgligTest {
    public static void main(String[] args) {

        JJCglibMeipo JJCglibMeipo = new JJCglibMeipo();
        CustomPerson instance = (CustomPerson) JJCglibMeipo.getInstance(CustomPerson.class);
        instance.findLove();


    }

}
