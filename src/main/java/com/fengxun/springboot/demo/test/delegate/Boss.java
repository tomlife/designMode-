package com.fengxun.springboot.demo.test.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/24 18:03
 * @Version 1.0
 */
public class Boss implements Labour {
    private Map<String, Labour> map = new HashMap<>();

    public Boss() {
        map.put("IOS", new LabourKaiKai());
        map.put("JAVA", new LabourDuDuZui());
    }

    @Override
    public void code(String code) {
        map.get(code.toUpperCase()).code(code);
    }
}
