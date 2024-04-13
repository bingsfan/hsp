package com.smh.buffered_;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * ClassName: BufferedWriter_
 * Package: com.smh.buffered_
 * Description:
 *将hello，韩顺平教育写到文件中
 * @Author mh sun
 * @Create 2024/4/13 12:59
 * @Version 1.0
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "d:\\mytest\\ok.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write("hello,韩顺平教育");
        bw.newLine();
        bw.write("hello3");
        bw.close();
    }
}
