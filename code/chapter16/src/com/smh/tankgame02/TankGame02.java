package com.smh.tankgame02;

import javax.swing.*;

/**
 * ClassName: TankGame01
 * Package: com.smh.tankgame
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/9 0:00
 * @Version 1.0
 */
public class TankGame02 extends JFrame {
//    定义一个MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }
    public TankGame02(){
        mp = new MyPanel();
        this.add(mp);//把面板加进去
        this.addKeyListener(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
