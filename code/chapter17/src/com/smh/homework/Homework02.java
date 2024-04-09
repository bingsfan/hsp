package com.smh.homework;

/**
 * ClassName: Homework02
 * Package: com.smh.homework
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/9 21:16
 * @Version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        new Thread(new User()).start();
        new Thread(new User()).start();
    }
}
class User implements Runnable{
    Object obj = new Object();

    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (obj) {
            while (true){
                if (Card.money>0){
                    Card.money -=1000;
                    System.out.println(Thread.currentThread().getName()+"取走了1000元"+" 还剩"
                    +Card.money);
                }else {
                    System.out.println("卡里没钱啦");
                    break;
                }
            }
        }
    }
}
class Card{
    public static int money = 10000;
}