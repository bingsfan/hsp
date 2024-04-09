package com.smh.single_;

/**
 * ClassName: SingleTon02
 * Package: com.smh.single_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/21 13:59
 * @Version 1.0
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}
class Cat {
    private String name;
    public static
    int n1 = 999;
    private static Cat cat;

    private Cat(String name) {
        System.out.println("構造器調用...");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {//如果還沒有創建 cat 對象
            cat = new Cat("小可愛");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}