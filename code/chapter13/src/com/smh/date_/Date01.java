package com.smh.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Date01
 * Package: com.smh.date_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/26 23:59
 * @Version 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println("当前日期"+d1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = sdf.format(d1);
        System.out.println(format);
//        string-->date
        String s = "1996年01月01日 12:20:30 星期一";
        Date d2 = sdf.parse(s);
        System.out.println(d2);
        System.out.println(sdf.format(d2));
    }
}
