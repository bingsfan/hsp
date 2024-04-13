package com.smh.inputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: FileInputStream_
 * Package: com.smh.inputStream_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 12:19
 * @Version 1.0
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01() throws IOException {
        String filePath = "d:\\mytest\\hello.txt";
        int readData = 0;
        FileInputStream fis = null;
        fis = new FileInputStream(filePath);
        while ((readData=fis.read())!=-1){
            System.out.print((char)readData);
        }
    }
    @Test
    public void readFile02() throws IOException {
        String filePath = "d:\\mytest\\hello.txt";
        byte buf[]= new byte[8];
        int readLen = 0;
        FileInputStream fis = null;
        fis = new FileInputStream(filePath);
        while ((readLen = fis.read(buf))!=-1){
            System.out.print(new String(buf,0,readLen));
        }

    }
}
