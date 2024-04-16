package com.smh.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: SocketTCP03Server
 * Package: com.smh.tcp
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/16 10:55
 * @Version 1.0
 */
public class SocketTCP03Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
//        打印客户端发来的
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s= bufferedReader.readLine();
        System.out.println(s);
//        向客户端打印
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client,字符流");
        bufferedWriter.newLine();//插入换行符表示结束
        bufferedWriter.flush();
//        关闭资源
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
