package com.smh.syn;

/**
 * ClassName: SellTicket
 * Package: com.smh.syn
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/9 20:56
 * @Version 1.0
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }
}

class SellTicket01 extends Thread{
    private static int ticketNum =100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj){
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