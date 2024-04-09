package com.smh.polyarr_;

/**
 * ClassName: Pwerson
 * Package: com.smh.polyarr_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/12 11:32
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String say(){
        return name + "\t" + age;
    }
}
