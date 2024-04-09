package com.smh.draw;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: DrawCircle
 * Package: com.smh.draw
 * Description:
 *画板上画个圆
 * @Author mh sun
 * @Create 2024/4/8 23:54
 * @Version 1.0
 */
public class DrawCircle extends JFrame{
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,100,100);
        g.setColor(Color.BLUE);
        g.fillRect(200,200,100,100);
    }
}