package com.smh.reflection.question;

import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ClassName: ReflectionQuestion
 * Package: com.smh.reflection.question
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/18 12:05
 * @Version 1.0
 */

public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("chapter23//src//re.properties"));
        String classPath = properties.get("classfullpath").toString();
        Class cls = Class.forName(classPath);
        Object o = cls.getConstructor().newInstance();
        System.out.println(o.getClass());
        String methodName = properties.get("method").toString();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
