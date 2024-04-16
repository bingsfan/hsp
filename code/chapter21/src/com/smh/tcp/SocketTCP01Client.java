package com.smh.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ClassName: SocketTCP01Client
 * Package: com.smh.tcp
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/16 10:42
 * @Version 1.0
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket="+socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        outputStream.close();
        socket.close();
    }
}
