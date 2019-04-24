package com.fengxun.springboot.demo.test.proxy.dynamicproxy.manualproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;

/**
 * @Author: tom
 * @author为fengx
 * @Date: 2019/4/17 17:14
 * @Version 1.0
 */
public class JJProxy {
    private static final String ln = "\r\n";

    public static Object newProxyInstance(JJClassLoader loader,
                                          Class<?>[] interfaces,
                                          JJInvocationHandler h) {
        //1 动态生成 java文件
        String str = generateSrc(interfaces);
        //2 编译 生成的 java文件
        //3 加载 生成java 文件
        String path = JJProxy.class.getResource("").getPath();
        File f = new File(path + "$Proxy0.java");
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            fw.write(str);
            fw.flush();
            fw.close();
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manage.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
            task.call();
            manage.close();
            Class proxyClass = loader.findClass("$Proxy0");
            Constructor c = proxyClass.getDeclaredConstructor(JJInvocationHandler.class);
            c.setAccessible(true);
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.fengxun.springboot.demo.test.proxy.dynamicproxy.manualproxy;".concat(ln));
        sb.append("import com.fengxun.springboot.demo.test.proxy.dynamicproxy.manualproxy.JJInvocationHandler;".concat(ln));
        sb.append("import java.lang.reflect.UndeclaredThrowableException;".concat(ln));
        sb.append("import com.fengxun.springboot.demo.test.proxy.dynamicproxy.manualproxy.JJProxy;".concat(ln));
        sb.append("import com.fengxun.springboot.demo.test.proxy.staticproxy.UserServiceProxy;".concat(ln));
        sb.append("import java.lang.reflect.Method;".concat(ln));
        sb.append("import java.lang.reflect.UndeclaredThrowableException;".concat(ln));
        sb.append("public final class $Proxy0 extends JJProxy ".concat(ln));
        sb.append("implements UserServiceProxy ".concat(ln)).append("{");
        sb.append(" private static Method m3;".concat(ln));
        sb.append(" private   JJInvocationHandler h;".concat(ln));
        sb.append("  public $Proxy0(JJInvocationHandler paramInvocationHandler) ".concat(ln));
        sb.append("  { ".concat(ln));
        sb.append("  this.h = paramInvocationHandler; ".concat(ln));
        sb.append("  } ".concat(ln));
        sb.append(" static ".concat(ln)).append("{");
        sb.append(" try ".concat(ln)).append("{".concat(ln));
        sb.append("m3 = Class.forName(\"com.fengxun.springboot.demo.test.proxy.staticproxy.UserDao\").getMethod(\"deleteUser\", new Class[0]);".concat(ln));
        sb.append("} catch (NoSuchMethodException localNoSuchMethodException)".concat(ln));
        sb.append("{".concat(ln));
        sb.append("throw new NoSuchMethodError(localNoSuchMethodException.getMessage());".concat(ln));
        sb.append("}".concat(ln));
        sb.append("   catch (ClassNotFoundException localClassNotFoundException) ".concat(ln));
        sb.append("{".concat(ln));
        sb.append("throw new NoClassDefFoundError(localClassNotFoundException.getMessage());".concat(ln));
        sb.append("}".concat(ln));
        sb.append("}".concat(ln));
        sb.append(" public final int deleteUser() ".concat(ln));
        sb.append("   { ".concat(ln));
        sb.append("   try {".concat(ln));
        sb.append("       return ((Integer)this.h.invoke(this, m3, null)).intValue(); ".concat(ln));
        sb.append(" } ".concat(ln));
        sb.append("  catch (RuntimeException localRuntimeException) ".concat(ln));
        sb.append("  { ".concat(ln));
        sb.append("   throw localRuntimeException; ".concat(ln));
        sb.append("  } ".concat(ln));
        sb.append("   catch (Throwable localThrowable) ".concat(ln));
        sb.append("  { ".concat(ln));
        sb.append("   throw new UndeclaredThrowableException(localThrowable); ".concat(ln));
        sb.append("   } ".concat(ln));
        sb.append("   } ".concat(ln));
        sb.append("}".concat(ln));
        return sb.toString();
    }


}
