package com.smh.buffered_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ClassName: BufferedReader_
 * Package: com.smh.buffered_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 12:56
 * @Version 1.0
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\mytest\\story.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
