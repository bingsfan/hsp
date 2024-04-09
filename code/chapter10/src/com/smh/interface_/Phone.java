package com.smh.interface_;

/**
 * ClassName: Phone
 * Package: com.smh.interface_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/21 14:06
 * @Version 1.0
 */
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
