package com.smh.structure;

import java.lang.reflect.Constructor;

/**
 * ClassName: CreateInstance
 * Package: com.smh.structure
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/18 13:03
 * @Version 1.0
 */
public class CreateInstance {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.smh.structure.User01");
        Constructor<?> constructor = cls.getConstructor(String.class);
        Object smh = constructor.newInstance("smh");
        System.out.println(smh);
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance(100, "张三丰");
        System.out.println(o);
    }
}
class User { //User类
    private int age = 10;
    private String name = "教育";

    public User() {//无参 public
    }

    public User(String name) {//public的有参构造器
        this.name = name;
    }

    private User(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}
