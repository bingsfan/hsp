package com.smh.outputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileOutputStream01
 * Package: com.smh.outputStream_
 * Description:
 *将数据写到文件中，如果文件不存在就创建文件
 * @Author mh sun
 * @Create 2024/4/13 12:29
 * @Version 1.0
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String filePath = "d:\\mytest\\a.txt";
        FileOutputStream fos = null;
        try {
            fos  = new FileOutputStream(filePath,true);
            fos.write('g');
            String str = "smh,world!";
            fos.write(str.getBytes());
            fos.write(str.getBytes(),0,3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
