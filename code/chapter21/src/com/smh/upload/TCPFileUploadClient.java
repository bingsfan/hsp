package com.smh.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


/**
 * 文件上传的客户端,图片是二进制文件，只能用字节流传输，课件用的buffered，我没用
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "d:\\mytest\\pic.jpg";
//        创建读取磁盘文件的输入流
        FileInputStream fis = new FileInputStream(filePath);
        byte data[] = StreamUtils.streamToByteArray(fis);
//        socket获取输出流，向服务端发data数组
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(data);
        socket.shutdownOutput();
//        接受服务器端传来的消息
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);
//        关闭资源
        fis.close();
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
