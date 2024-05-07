package com.smh.jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Properties;

/**
 * ClassName: Jdbc01
 * Package: com.smh.jdbc
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/28 17:06
 * @Version 1.0
 */
public class Jdbc01 {
    public static void main(String[] args) throws Exception {
        //前置工作： 在项目下创建一个文件夹比如 libs
        // 将 mysql.jar 拷贝到该目录下，点击 add to project ..加入到项目中
        //1. 注册驱动
        final String driver = "com.mysql.cj.jdbc.Driver";
        //2. 得到连接
        //(1) jdbc:mysql:// 规定好表示协议，通过jdbc的方式连接mysql
        //(2) localhost 主机，可以是ip地址
        //(3) 3306 表示mysql监听的端口
        //(4) hsp_db02 连接到mysql dbms 的哪个数据库
        //(5) mysql的连接本质就是前面学过的socket连接
        String url = "jdbc:mysql://localhost:3306/hsp_db01";
        //将 用户名和密码放入到Properties 对象
        String user = "root";
        String pwd = "sun200128";
        //3. 执行sql
        String sql = "insert into actor values(null, '刘德华', '男', '1970-11-11', '110')";
        String sql1 = "select * from actor";
        //statement 用于执行静态SQL语句并返回其生成的结果的对象
        Class.forName(driver);
        System.out.println("连接数据库...");
        Connection connect = DriverManager.getConnection(url,user,pwd);
        Statement statement = connect.createStatement();
        boolean execute = statement.execute(sql);
        ResultSet resultSet = statement.executeQuery(sql1);
        while(resultSet.next()){
            // 通过字段检索
            int id  = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String sex = resultSet.getString("sex");
            Date borndate = resultSet.getDate("borndate");
            String phone = resultSet.getString("phone");
            // 输出数据
            System.out.print("ID: " + id);
            System.out.print(" 姓名 " + name);
            System.out.print(" 性别 " + sex);
            System.out.print(" 出生日期 " + borndate);
            System.out.print(" 电话 " + phone);
            System.out.print("\n");
        }
        statement.close();
        connect.close();
    }
}
