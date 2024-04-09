package com.smh.tankgame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * ClassName: MyPanel
 * Package: com.smh.tank-game02
 * Description:
 *游戏的绘图区域
 * @Author mh sun
 * @Create 2024/4/9 2:19
 * @Version 1.0
 */
public class MyPanel extends JPanel implements KeyListener {
//    定义我的坦克
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTanksSize =3;
    public MyPanel(){
        hero = new Hero(100,100);
        for (int i =0;i<enemyTanksSize;i++) {
            enemyTanks.add(new EnemyTank(100*(i+1),0,2));
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形默认黑色
//        用一个方法画出坦克
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);
        for (int i =0;i<enemyTanksSize;i++) {
            drawTank(enemyTanks.get(i).getX(),enemyTanks.get(i).getY(),g,enemyTanks.get(i).getDirect(),0);
        }
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
        switch (type) {
            case 0 ->
//                敌人的坦克
                    g.setColor(Color.cyan);
            case 1 ->
//                自己的坦克
                    g.setColor(Color.yellow);
        }
//        根据坦克的方向来绘制坦克
//        0上1右2下3左
        switch (direct){
            case 0:
//                方向朝上的
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x + 10, y + 10, 20, 20, false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 3: //表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            default:
                System.out.println("暂时不处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        处理wasd
        if(e.getKeyCode()==KeyEvent.VK_W){
            hero.setDirect(0);
            hero.moveUp();
        }else if (e.getKeyCode()==KeyEvent.VK_D){
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode()==KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode()==KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
