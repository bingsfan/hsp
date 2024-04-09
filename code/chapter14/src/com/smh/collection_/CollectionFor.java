package com.smh.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: CollectionFor
 * Package: com.smh.collection_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/26 14:11
 * @Version 1.0
 */
public class CollectionFor {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("小黑",5));
        dogs.add(new Dog("小红",7));
        dogs.add(new Dog("小白",8));
        Iterator<Dog> iterator = dogs.iterator();
        while (iterator.hasNext()) {
            Dog next =  iterator.next();
            System.out.println(next);
        }
        for(Dog dog:dogs){
            System.out.println(dog);
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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