package com.smh.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ClassName: LocalDate_
 * Package: com.smh.date_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/27 0:13
 * @Version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());
    }
}
