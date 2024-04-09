package com.smh.polyarr_;

/**
 * ClassName: PolyArray
 * Package: com.smh.polyarr_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/12 11:37
 * @Version 1.0
 */
public class PolyArray {
    public static void main(String[] args) {
        Person persons[]=new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);
        for (Person person : persons) {
            System.out.println(person.say());
        }
    }
}
