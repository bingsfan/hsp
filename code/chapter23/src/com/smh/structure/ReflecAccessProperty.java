package com.smh.structure;

import java.lang.reflect.Field;

/**
 * ClassName: ReflecAccessProperty
 * Package: com.smh.structure
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/18 13:10
 * @Version 1.0
 */
public class ReflecAccessProperty {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.smh.structure.Student");
        Object o = cls.getConstructor().newInstance();
        System.out.println(o.getClass());

        Field age = cls.getField("age");
        age.set(o,88);
        System.out.println(age.get(o));

        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
//        name.set(o,"老汉");
//        System.out.println(name.get(o));
        name.set(null,"老汉");
        System.out.println(name.get(null));
    }
}
class Student {//类
    public int age;
    private static String name;

    public Student() {//构造器
    }
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

