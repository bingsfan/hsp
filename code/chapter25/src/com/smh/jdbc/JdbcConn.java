package com.smh.jdbc;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

/**
 * ClassName: JdbcConn
 * Package: com.smh.jdbc
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/28 17:31
 * @Version 1.0
 */
public class JdbcConn {
    public static void main(String[] args) throws Exception{
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        在加载driver类时完成注册，不用写forname也能使用
        String url ="jdbc:mysql://localhost:3306/hsp_db01";
        String user = "root";
        String pwd = "sun200128";

        Connection connection = DriverManager.getConnection(url, user, pwd);
        System.out.println(connection);
    }
    @Test
    public void test(){
        // Get base path
        File appBase = new File("."); //current directory
        String path = appBase.getAbsolutePath();
        System.out.println(path);
    }
    @Test
    public void conn5() throws  Exception{
        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);//建议写上

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("方式5 " + connection);
    }
}
