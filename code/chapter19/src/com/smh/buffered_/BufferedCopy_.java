package com.smh.buffered_;

import java.io.*;

/**
 * ClassName: BufferedCopy_
 * Package: com.smh.buffered_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 13:03
 * @Version 1.0
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "d:\\mytest\\a.java";
        String destFilePath = "d:\\mytest\\a2.java";
        String line;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            while ((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
