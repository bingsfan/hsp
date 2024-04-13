package com.smh.transformation;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * ClassName: OurputStreamWriter_
 * Package: com.smh.transformation
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 14:22
 * @Version 1.0
 */
public class OurputStreamWriter_ {
    public static void main(String[] args) throws Exception{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\mytest\\a.txt",true),"utf8");
        osw.write("OurputStreamWriter测试写入");
        osw.close();
    }
}

