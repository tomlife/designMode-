package com.fengxun.springboot.demo.test;

import com.fengxun.springboot.demo.test.singleton.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/11 15:00
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws Exception {
        SerializableSingleton instance = SerializableSingleton.getInstance();
        FileOutputStream fos = new FileOutputStream("instance");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(instance);
        objectOutputStream.flush();
        objectOutputStream.close();


        FileInputStream fis = new FileInputStream("instance");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        SerializableSingleton o = (SerializableSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println( instance == o);
        Class<?> cl = Class.forName(HungrySingleton.class.getName());
        Method readResolve = getInheritableMethod(cl, "readResolve", null, Object.class);

    }
    private static Method getInheritableMethod(Class<?> cl, String name,
                                               Class<?>[] argTypes,
                                               Class<?> returnType)
    {
        Method meth = null;
        Class<?> defCl = cl;
        while (defCl != null) {
            try {
                meth = defCl.getDeclaredMethod(name, argTypes);
                break;
            } catch (NoSuchMethodException ex) {
                defCl = defCl.getSuperclass();
            }
        }

        if ((meth == null) || (meth.getReturnType() != returnType)) {
            return null;
        }
        meth.setAccessible(true);
        int mods = meth.getModifiers();
        if ((mods & (Modifier.STATIC | Modifier.ABSTRACT)) != 0) {
            return null;
        } else if ((mods & (Modifier.PUBLIC | Modifier.PROTECTED)) != 0) {
            return meth;
        } else if ((mods & Modifier.PRIVATE) != 0) {
            return (cl == defCl) ? meth : null;
        } else {
            return packageEquals(cl, defCl) ? meth : null;
        }
    }
    /**
     * Returns true if classes are defined in the same runtime package, false
     * otherwise.
     */
    private static boolean packageEquals(Class<?> cl1, Class<?> cl2) {
        return (cl1.getClassLoader() == cl2.getClassLoader() &&
                getPackageName(cl1).equals(getPackageName(cl2)));
    }
    private static String getPackageName(Class<?> cl) {
        String s = cl.getName();
        int i = s.lastIndexOf('[');
        if (i >= 0) {
            s = s.substring(i + 2);
        }
        i = s.lastIndexOf('.');
        return (i >= 0) ? s.substring(0, i) : "";
    }

}

class ThreadExecute implements Runnable {
    @Override
    public void run() {
        System.out.println("instance = " + LazyHolderSingleton.getInstance());
    }
}