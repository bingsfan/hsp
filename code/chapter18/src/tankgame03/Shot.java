package tankgame03;

/**
 * ClassName: Shot
 * Package: tankgame03
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/11 0:06
 * @Version 1.0
 */
public class Shot implements Runnable{
    int x ;
    int y;
    int direct;
    int speed = 2;
    boolean isLive  = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direct) {
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }
            System.out.println("子弹 x=" + x + " y=" + y);
            // 当子弹移动到面板的边界时，就应该销毁（把启动的子弹的线程销毁)
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }

        }
    }
}
