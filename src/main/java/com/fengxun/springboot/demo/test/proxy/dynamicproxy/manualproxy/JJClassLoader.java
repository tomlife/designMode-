package com.fengxun.springboot.demo.test.proxy.dynamicproxy.manualproxy;

import java.io.*;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/23 15:43
 * @Version 1.0
 */
public class JJClassLoader  extends  ClassLoader{
    private File classPathFile;

    public JJClassLoader() {
        String path = JJClassLoader.class.getResource("").getPath();
        classPathFile = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = JJClassLoader.class.getPackage().getName() + "." + name;
        File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
        if (classFile.exists()) {
            try (ByteArrayOutputStream out = new ByteArrayOutputStream(); FileInputStream fileInputStream = new FileInputStream(classFile);) {
                byte[] bytes = new byte[1024];
                int leng;
                while ((leng = fileInputStream.read(bytes)) != -1) {
                    out.write(bytes,0,leng);
                }
               return   defineClass(className,out.toByteArray(),0,out.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }



}
