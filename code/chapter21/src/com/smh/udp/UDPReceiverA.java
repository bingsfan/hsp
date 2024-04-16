package com.smh.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: UDPReceiverA
 * Package: com.smh.udp
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/16 11:29
 * @Version 1.0
 */
public class UDPReceiverA {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(9999);
        byte buf[] = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
//        拆包取出数据显示
        int length = packet.getLength();
        byte data[] = packet.getData();
        String s = new String(data,0,length);
        System.out.println(s);
//        发送给B
        data = "好的，明天见".getBytes();
        packet = new DatagramPacket(data,data.length, InetAddress.getByName("10.60.29.215"),9998);
        socket.send(packet);
        socket.close();
    }
}
