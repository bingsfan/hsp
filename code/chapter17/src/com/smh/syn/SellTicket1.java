package com.smh.syn;

/**
 * ClassName: SellTicket1
 * Package: com.smh.syn
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/9 21:08
 * @Version 1.0
 */
public class SellTicket1 {
    public static void main(String[] args) {
        new Thread(new SellTicket02()).start();
        new Thread(new SellTicket02()).start();
        new Thread(new SellTicket02()).start();
    }
}
class SellTicket02 implements Runnable{
    private static int ticketNum =100;
    private static Object obj = new Object();

    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true){
            synchronized (obj) {
                if(ticketNum>0){
                    System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票   " +
                            "剩余票数="+(--ticketNum));
                }else {
                    System.out.println("票卖完了。。。");
                    break;
                }
            }
        }
    }
}