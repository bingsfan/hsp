package com.smh.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: MyPanel
 * Package: com.smh.tankgame
 * Description:
 *游戏的绘图区域
 * @Author mh sun
 * @Create 2024/4/9 2:19
 * @Version 1.0
 */
public class MyPanel extends JPanel {
//    定义我的坦克
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形默认黑色
//        用一个方法画出坦克
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    /**
     *
     * @param x 坦克左上角x坐标
     * @param y 坦克左上角y坐标
     * @param g 画笔
     * @param direct 坦克方向，上下左右
     * @param type 类型
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            case 0:
//                自己的坦克
                g.setColor(Color.cyan);
                break;
            case 1:
//                敌人的坦克
                g.setColor(Color.yellow);
                break;
        }
//        根据坦克的方向来绘制坦克
        switch (direct){
            case 0:
//                方向朝上的
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x + 10, y + 10, 20, 20, false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y);
                break;
            default:
                System.out.println("暂时不处理");
        }
    }
}
