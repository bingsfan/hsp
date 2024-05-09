package com.smh.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddTest
 * Package: com.smh.api
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/16 10:30
 * @Version 1.0
 */
public class InetAddTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
//        根据主机名或域名获取ip地址
        InetAddress host2 = InetAddress.getByName("DESKTOP-DTRV936");
        System.out.println(host2);
        InetAddress host3 = InetAddress.getByName("www.baidu.com");
        System.out.println(host3);
        String host3Name = host3.getHostName();
        System.out.println(host3Name);
        System.out.println(host3.getHostAddress());

    }
}
