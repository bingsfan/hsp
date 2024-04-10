package tankgame03;

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
public class TankGame03 extends JFrame {
//    定义一个MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame03 tankGame03 = new TankGame03();
    }
    public TankGame03(){
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//把面板加进去
        this.addKeyListener(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
