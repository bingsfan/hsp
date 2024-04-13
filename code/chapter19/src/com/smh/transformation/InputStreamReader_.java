package com.smh.transformation;

import com.smh.buffered_.BufferedReader_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * ClassName: InputStreamReader_
 * Package: com.smh.transformation
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 14:18
 * @Version 1.0
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws  Exception{
        String filePath = "d:\\mytest\\a.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"utf8");
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        System.out.println(str);
        br.close();
    }
}
