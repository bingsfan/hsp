package com.smh.upload;

import java.io.*;
import java.lang.invoke.VarHandle;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件上传的服务端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
//      接受信息，写入磁盘
        InputStream inputStream = socket.getInputStream();
        byte data[] = StreamUtils.streamToByteArray(inputStream);
        String destPath = "chapter21\\src\\new_pic.jpg";
        FileOutputStream fos = new FileOutputStream(destPath);
        fos.write(data);
//        向客户端回复收到图片
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("收到图片".getBytes());
        socket.shutdownOutput();
//        关闭资源
        outputStream.close();
        inputStream.close();
        fos.close();
        socket.close();
        serverSocket.close();
    }
}
