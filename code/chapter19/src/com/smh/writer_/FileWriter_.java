package com.smh.writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: FileWriter_
 * Package: com.smh.writer_
 * Description:
 *  使用filewriter将"风雨之后，定见彩虹写到"note.txt下
 * @Author mh sun
 * @Create 2024/4/13 12:51
 * @Version 1.0
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String FilePath  = "d:\\mytest\\note.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(FilePath);
            fw.write("风雨之后，定见彩虹");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
