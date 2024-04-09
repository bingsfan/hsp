package com.smh.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * ClassName: BallMove
 * Package: com.smh.event_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/9 2:41
 * @Version 1.0
 */
public class BallMove extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}


class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 20, 20);
    }
//有字符输出，该方法触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
//有键按下就触发
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y++;
        }else if (e.getKeyCode()==KeyEvent.VK_UP){
            y--;
        } else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
            x++;
        }
        this.repaint();
    }
//某个键松开触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}