package com.smh.tankgame02;

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
    private int direct;
    private int speed =1;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public Tank(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

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
    public void moveUp(){
        y-=speed;
    }
    public void moveRight(){
        x+=speed;
    }
    public void moveDown(){
        y+=speed;
    }public void moveLeft(){
        x-=speed;
    }
}
