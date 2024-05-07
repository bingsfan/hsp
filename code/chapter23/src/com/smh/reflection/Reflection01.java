package com.smh.reflection;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ClassName: Reflection01
 * Package: com.smh.reflection
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/18 12:24
 * @Version 1.0
 */
public class Reflection01 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("chapter23//src//re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();

        Class<?> cls = Class.forName(classfullpath);
        Object o = cls.getConstructor().newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
        Field age = cls.getField("age");
        System.out.println(age.get(o));

        Constructor<?> constructor = cls.getConstructor();
        System.out.println(constructor);
        Constructor<?> constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);
    }
}
