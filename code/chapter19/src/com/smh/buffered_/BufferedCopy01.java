package com.smh.buffered_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * ClassName: BufferedCopy01
 * Package: com.smh.buffered_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 13:16
 * @Version 1.0
 */
public class BufferedCopy01 {
    public static void main(String[] args) throws Exception{
        String srcFilePath = "d:\\mytest\\video.mp4";
        String destFilePath = "d:\\mytest\\copy_video.mp4";
        BufferedInputStream bis =null;
        BufferedOutputStream bos = null;
        byte buf[] = new byte[1024];
        int readLen = 0;
        bis = new BufferedInputStream(new FileInputStream(srcFilePath));
        bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        while ((readLen=bis.read(buf))!=-1){
            bos.write(buf,0,readLen);
        }
        bis.close();
        bos.close();
    }
}
