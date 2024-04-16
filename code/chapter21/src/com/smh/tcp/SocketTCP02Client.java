package com.smh.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * ClassName: SocketTCP02Client
 * Package: com.smh.tcp
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/16 10:46
 * @Version 1.0
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
//        给服务器端发信息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        socket.shutdownOutput();
//        读取服务器端发来的消息
        InputStream inputStream = socket.getInputStream();
        byte buf[] = new byte[1024];
        int readLen = 0;
        while ((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
