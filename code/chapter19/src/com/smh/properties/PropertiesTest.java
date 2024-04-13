package com.smh.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesTest
 * Package: com.smh.properties
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/13 14:31
 * @Version 1.0
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("chapter19//src//mysql.properties"));
        properties.list(System.out);
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(user);
        System.out.println(pwd);
        properties.setProperty("user","孙懋恒");
        properties.store(new FileOutputStream("D:\\idea_code\\hspjava\\hsp\\code\\chapter19\\src\\mysql2.properties"),null);
    }
}
