package com.fengxun.springboot.demo.test.template;

import com.fengxun.springboot.demo.test.TestView;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/28 10:57
 * @Version 1.0
 */
public abstract class View {
    private static String string;
    //  protected abstract void checkHomeWork();

    public void onCreate() {
        initContext();
        initLayer();
        initView();
        initDraw();
        setLayout();
        initData();
    }

    protected abstract void setLayout();

    protected abstract void initDraw() ;


    protected void initLayer() {
        System.out.println("Net Work initLayer");
    }

    protected abstract void initView();

    protected abstract void initContext();

    protected void initData() {
        System.out.println("Net Work Course");
    }

    ;

    public void test() {
        string = "B0012";
        ArrayList<TestView> objects = new ArrayList<>();
        for (int j = 0; j < 100000; j++) {
            objects.add(new TestView(j, j + "name"));
        }
        long l = System.currentTimeMillis();
        System.out.println("开始时间 " + l);
        final List<TestView> collect = objects.stream().filter(s -> s.age < 50000).collect(Collectors.toList());
        long m = System.currentTimeMillis();
        System.out.println("结束时间 " + m + "  用时 " + (m - l) + ("  最后的答案: " + collect.size()));
        final ArrayList<Integer> arr = new ArrayList<>();
        l = System.currentTimeMillis();
        ArrayList<Object> objects1 = new ArrayList<>();
        System.out.println("开始时间: " + l);
        for (int j = 0; j < 100000; j++) {
            TestView testView = objects.get(j);
            if (testView.age < 50000) {
                objects1.add(testView);
            }
        }
        m = System.currentTimeMillis();
        System.out.println("结束时间: " + m + "  用时 " + (m - l) + ("  最后的答案: " + objects1.size()));
    }

    public static int testFuntion(String string, Function<String, Integer> function) {
        Integer apply = function.apply(string);
        return apply;
    }

    public static int testFuntion1(String string, TestInterface testInterface) {

        int apply = 0;
        return apply;
    }

    /**
     * 1.8 写法  Supplier 无入参有返回值 使用  get方法执行
     */
    public static String testSupplier(Supplier<String> supplier) {
        String concat = supplier.get().concat(" B0004");
        return concat;
    }

}


