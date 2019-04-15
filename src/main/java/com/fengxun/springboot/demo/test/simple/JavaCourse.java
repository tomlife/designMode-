package com.fengxun.springboot.demo.test.simple;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/11 15:05
 * @Version 1.0
 */
public class JavaCourse {

    private JavaCourse() {
    }

    public static   JavaCourse getInstance() {
        return JavaHolder.javaCourse;
    }

    private static class JavaHolder{
        private static final JavaCourse javaCourse = new JavaCourse();
    }

}
