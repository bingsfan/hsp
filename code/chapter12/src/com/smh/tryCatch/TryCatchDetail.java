package com.smh.tryCatch;

/**
 * ClassName: TryCatchDetail
 * Package: com.smh.tryCatch
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/24 16:35
 * @Version 1.0
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "韩顺平";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally 代码块被执行...");
        }
        System.out.println("程序继续...");

    }
}
