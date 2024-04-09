package com.smh.homework;

import java.util.HashMap;

/**
 * ClassName: Homework03
 * Package: com.smh.homework
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/5 13:47
 * @Version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        hashMap.put("jack",2600);
        for (String key : hashMap.keySet()) {
            hashMap.put(key,hashMap.get(key)+100);
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }
    }
}
