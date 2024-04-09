package com.smh.exception_;

import java.util.Scanner;

/**
 * ClassName: TryCatchExercise04
 * Package: com.smh.exception_
 * Description:
 *如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止
 * @Author mh sun
 * @Create 2024/3/24 15:57
 * @Version 1.0
 */
//public class TryCatchExercise04 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = 0;
//        boolean loop = true;
//        while (loop){
//            System.out.println("请输入一个整数");
//            String inputStr = scanner.next();
//            try {
//                num = Integer.parseInt(inputStr);
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("输入的不是整数");;
//            }
//        }
//    }
//}
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean loop = true;
        while (loop){
            System.out.println("请输入一个整数");
            String inputStr = scanner.next();

            try {
                num = Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }

        }
    }
}