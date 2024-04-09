package com.smh.single_;

/**
 * ClassName: SingleTon01
 * Package: com.smh.single_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/21 13:49
 * @Version 1.0
 */
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}
class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("小红红");
    private GirlFriend(String name) {
        System.out.println("構造器被調用.");
        this.name = name;
    }
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}