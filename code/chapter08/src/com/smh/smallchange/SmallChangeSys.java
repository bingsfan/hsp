package com.smh.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: SmallChangeSys
 * Package: com.smh.smallchange
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/12 15:00
 * @Version 1.0
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = "";
        boolean loop = true;

        String details = "\n----------零钱通明细----------";

        double balance = 0;
        double money = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");


        String note = "";

        do {
            System.out.println("----------零钱通菜单----------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");
            System.out.print("请选择（1-4）");
            key=scanner.next();
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    if(money<=0){
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance+=money;
                    date = new Date();
                    details +="\n收益入账\t"+money+"\t"+sdf.format(date) +"\t"+balance;
                    break;
                case "3":
                    System.out.print("输入消费金额");
                    money = scanner.nextDouble();
                    if(money<=0||money>balance){
                        System.out.println("消费金额应在0-"+balance);
                        break;
                    }
                    System.out.print("输入消费用途");
                    note = scanner.next();
                    balance-=money;
                    date = new Date();
                    details +="\n"+note+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
                    break;
                case "4":
                    String choice = "";
                    while (true){
                        System.out.println("你确定要退出吗?y/n");
                        choice = scanner.next();
                        if("y".equals(choice)||"n".equals(choice)){
                            break;
                        }
                    }
                    if("y".equals(choice)){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        }while (loop);
        System.out.println("退出了零钱通");
    }
}
