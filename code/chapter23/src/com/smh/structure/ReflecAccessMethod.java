package com.smh.structure;

import java.lang.reflect.Method;

/**
 * ClassName: ReflecAccessMethod
 * Package: com.smh.structure
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/18 13:17
 * @Version 1.0
 */
public class ReflecAccessMethod {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.smh.structure.Boss");
        Object o = cls.getConstructor().newInstance();
        Method hi = cls.getMethod("hi", String.class);
        hi.invoke(o,"韩顺平教育");

//        private static 方法
        Method say = cls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(null, 200, "李四", '女'));

        Object reval = say.invoke(null, 200, "李四", '女');
        System.out.println(reval.getClass());

        Method m1 = cls.getMethod("m1");
        Object reval2 = m1.invoke(o);
        System.out.println(reval2.getClass());


    }
}
class Monster {}
class Boss {//类
    public int age;
    private static String name;

    public Boss() {//构造器
    }

    public Monster m1() {
        return new Monster();
    }

    private static String say(int n, String s, char c) {//静态方法
        return n + " " + s + " " + c;
    }

    public void hi(String s) {//普通public方法
        System.out.println("hi " + s);
    }
}

