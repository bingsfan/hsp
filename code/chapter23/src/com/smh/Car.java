package com.smh;

/**
 * ClassName: Car
 * Package: com.smh
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/18 12:38
 * @Version 1.0
 */
public class Car {
    public String brand = "宝马";//品牌
    public int price = 500000;
    public String color = "白色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
