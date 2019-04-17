package com.fengxun.springboot.demo.test.singleton;

import java.io.Serializable;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/16 14:40
 * @Version 1.0
 */
public class SerializableSingleton implements Serializable {
    public SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return SerializableHolder.serializableSingleton;
    }

    private static class SerializableHolder {
        private static SerializableSingleton serializableSingleton = new SerializableSingleton();
    }

    public Object readResolve() {
        return SerializableHolder.serializableSingleton;
    }
}
