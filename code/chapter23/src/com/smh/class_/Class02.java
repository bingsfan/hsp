package com.smh.class_;

import com.smh.Car;

import java.lang.reflect.Field;

/**
 * ClassName: Class01
 * Package: com.smh.class_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/18 12:38
 * @Version 1.0
 */
public class Class02 {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.smh.Car");
        //2. 输出cls
        System.out.println(cls);
        System.out.println(cls.getClass());
        //3. 得到包名
        System.out.println(cls.getPackage().getName());
        //4. 得到全类名
        System.out.println(cls.getName());


        Car car = (Car)cls.getConstructor().newInstance();
        System.out.println(car);

        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));

        brand.set(car,"宝马");
        System.out.println(brand.get(car));

        System.out.println("-----所有的字段属性-----");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

    }
}
