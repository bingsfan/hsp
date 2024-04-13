package com.smh.objectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ClassName: ObjectInput_
 * Package: com.smh.objectStream
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 13:28
 * @Version 1.0
 */
public class ObjectInput_ {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\mytest\\data.dat"));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());
        ois.close();
    }
}
