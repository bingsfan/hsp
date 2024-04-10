package tankgame03;

/**
 * ClassName: Hero
 * Package: com.smh.tankgame
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/9 2:19
 * @Version 1.0
 */
public class Hero extends Tank {
    Shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank(){
        switch (getDirect()) {//得到Hero对象方向
            case 0: //向上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1: //向右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: //向下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: //向左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        //启动我们的Shot线程
        new Thread(shot).start();
    }
}
