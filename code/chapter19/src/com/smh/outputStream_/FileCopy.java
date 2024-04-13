package com.smh.outputStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileCopy
 * Package: com.smh.outputStream_
 * Description:
 * 将d:\\mytest\\pic.jpg 拷贝到d:\\mytest\\copy_pic.jpg
 * @Author mh sun
 * @Create 2024/4/13 12:36
 * @Version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "d:\\mytest\\pic.jpg";
        String destFilePath = "d:\\mytest\\copy_pic.jpg";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(srcFilePath);
            fos = new FileOutputStream(destFilePath);
            byte buf[] = new byte[1024];
            int readLen = 0;
            while ((readLen = fis.read(buf))!=-1){
                fos.write(buf,0,readLen);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
