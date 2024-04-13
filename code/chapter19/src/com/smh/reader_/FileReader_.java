package com.smh.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName: FileReader_
 * Package: com.smh.reader_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 12:43
 * @Version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath  = "d:\\mytest\\story.txt";
        FileReader fr = null;
        int readLen = 0;
        char buf[] = new char[8];
        try {
            fr = new FileReader(filePath);
            while ((readLen=fr.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
