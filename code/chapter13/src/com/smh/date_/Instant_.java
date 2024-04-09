package com.smh.date_;

import java.time.Instant;
import java.util.Date;

/**
 * ClassName: Instant_
 * Package: com.smh.date_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/27 0:18
 * @Version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        Date date = Date.from(instant);
        System.out.println(date);
    }
}
