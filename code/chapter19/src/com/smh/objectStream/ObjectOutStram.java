package com.smh.objectStream;

import java.io.*;

/**
 * ClassName: ObjectOutStram
 * Package: com.smh.objectStream
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 13:23
 * @Version 1.0
 */
public class ObjectOutStram {
    public static void main(String[] args) throws Exception{
        String filePath  = "d:\\mytest\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeUTF("韩顺平教育");
        oos.writeObject(new Dog("小黑",20));
        oos.close();
    }
}
class Dog implements Serializable{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}