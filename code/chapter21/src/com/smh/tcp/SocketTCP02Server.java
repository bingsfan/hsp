package com.smh.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: SocketTCP02Server
 * Package: com.smh.tcp
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/16 10:45
 * @Version 1.0
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
//        输出从客户端发来的信息
        byte buf[] = new byte[1024];
        int readLen = 0;
        while ((readLen=inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
//        给客户端回复
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
//        结束标记
        socket.shutdownOutput();
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
