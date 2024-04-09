package com.smh.stringBuffer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: StringBufferExer02
 * Package: com.smh.stringBuffer
 * Description:
 *输入商品名称和商品价格，要求打印效果示例, 使用前面学习的方法完成：
 * 商品名   商品价格
 * 手机     123,564.59
 * //比如 价格 3,456,789.88
 * 要求：价格的小数点前面每三位用逗号隔开, 在输出。
 * @Author mh sun
 * @Create 2024/3/25 18:00
 * @Version 1.0
 */
public class StringBufferExer02 {
    public static void main(String[] args) {
        Integer integers[] = {1,20,90};
//        for(Integer integer:integers){
//            System.out.println(integer);
//        }
        System.out.println(Arrays.toString(integers));
        Integer arr[] = {1,-1,7,0,89};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        Integer[] integers1 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(integers1));
    }
}
