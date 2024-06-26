package com.smh.codeblock;

/**
 * ClassName: CodeBlockDetail04
 * Package: com.smh.codeblock
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/20 21:12
 * @Version 1.0
 */
public class CodeBlockDetail04 {
    public static void main(String[] args) {
        C02 c02 = new C02();
    }
}
class A02 { //父类
    private static int n1 = getVal01();
    static {
        System.out.println("A02 的一个静态代码块..");//(2)
    }
    {
        System.out.println("A02 的第一个普通代码块..");//(5)
    }
    public int n3 = getVal02();//普通属性的初始化
    public static int getVal01() {
        System.out.println("getVal01");//(1)
        return 10;
    }
    public int getVal02() {
        System.out.println("getVal02");//(6)
        return 10;
    }
    public A02() {//构造器
//隐藏
//super()
//普通代码和普通属性的初始化......
        System.out.println("A02 的构造器");//(7)
    }
}
class C02 {
    private int n1 = 100;
    private static int n2 = 200;
    private void m1() {
    }
    private static void m2() {
    }
    static {
//静态代码块，只能调用静态成员
//System.out.println(n1);错误
        System.out.println(n2);//ok
//m1();//错误
        m2();
    }
    {
//普通代码块，可以使用任意成员
        System.out.println(n1);
        System.out.println(n2);//ok
        m1();
        m2();
    }
}
class B02 extends A02 { //
    private static int n3 = getVal03();
    static {
        System.out.println("B02 的一个静态代码块..");//(4)
    }
    public int n5 = getVal04();
    {
        System.out.println("B02 的第一个普通代码块..");//(9)
    }
    public static int getVal03() {
        System.out.println("getVal03");//(3)
        return 10;
    }
    public int getVal04() {
        System.out.println("getVal04");//(8)
        return 10;
    }
    //一定要慢慢的去品..
    public B02() {//构造器
//隐藏了
//super()
//普通代码块和普通属性的初始化...
        System.out.println("B02 的构造器");//(10)
// TODO Auto-generated constructor stub
    }
}