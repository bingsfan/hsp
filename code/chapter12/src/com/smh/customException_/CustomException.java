package com.smh.customException_;

/**
 * ClassName: CustomException
 * Package: com.smh.customException_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/24 16:15
 * @Version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 1;
        if(!(age>=18&&age<=120)){
            throw new AgeException("年龄要再18-120之前");
        }
        System.out.println("年龄范围正确");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}