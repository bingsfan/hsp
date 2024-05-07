package com.smh.structure;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionUtils
 * Package: com.smh.structure
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/18 12:46
 * @Version 1.0
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }
    @Test
    public void api_01() throws Exception{
        Class<?> cls = Class.forName("com.smh.structure.Person");
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());//包含父类的公有的
        }
        System.out.println("------获取本类中的所有属性-------");//不包含父类的
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
        System.out.println("--------方法----------");
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("-------declared-------");
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
        System.out.println("------构造器----------");
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }
        System.out.println("-----------declared-----------");
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }
        System.out.println("-----------------------");
        Class<?> superclass = cls.getSuperclass();
        System.out.println(superclass);
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }
}
class A {
    public String hobby;

    public void hi() {

    }

    public A() {
    }

    public A(String name) {
    }
}

interface IA {
}

interface IB {

}

@Deprecated
class Person extends A implements IA, IB {
    //属性
    public String name;
    protected static int age; // 4 + 8 = 12
    String job;
    private double sal;

    //构造器
    public Person() {
    }

    public Person(String name) {
    }

    //私有的
    private Person(String name, int age) {

    }

    //方法
    public void m1(String name, int age, double sal) {

    }

    protected String m2() {
        return null;
    }

    void m3() {

    }

    private void m4() {

    }
}
