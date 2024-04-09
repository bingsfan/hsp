package com.smh.interface_;

/**
 * ClassName: Computer
 * Package: com.smh.interface_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/21 14:21
 * @Version 1.0
 */
public class Computer {
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }
}
