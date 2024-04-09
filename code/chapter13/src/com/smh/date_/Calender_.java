package com.smh.date_;

import java.util.Calendar;

/**
 * ClassName: Calender_
 * Package: com.smh.date_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/27 0:07
 * @Version 1.0
 */
public class Calender_ {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH)+1);
//        month要+1
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.HOUR));
        System.out.println(instance.get(Calendar.MINUTE));
        System.out.println(instance.get(Calendar.SECOND));

    }
}
