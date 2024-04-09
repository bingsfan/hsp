package com.smh.tankgame;

/**
 * ClassName: Tank
 * Package: com.smh.tankgame
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/9 2:18
 * @Version 1.0
 */
public class Tank {
    private int x;
    private int y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
