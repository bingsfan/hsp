package com.smh.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * ClassName: SocketTCP03Client
 * Package: com.smh.tcp
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/16 10:55
 * @Version 1.0
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server 字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
