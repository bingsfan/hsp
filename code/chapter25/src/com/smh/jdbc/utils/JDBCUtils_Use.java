package com.smh.jdbc.utils;




import com.mysql.cj.protocol.Resultset;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;
import java.sql.*;

/**
 * ClassName: JDBCUtils_Use
 * Package: com.smh.jdbc.utils
 * Description:
 *
 * @Author mh sun
 * @Create 2024/5/7 21:48
 * @Version 1.0
 */
public class JDBCUtils_Use {
    @Test
    public void testSelect() {
        Connection connection = null;
        String sql = "select * from actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        try {
            connection=JDBCUtils.getConnection();
            System.out.println(connection.getClass());
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,5);
            set = preparedStatement.executeQuery();
            while (set.next()){
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date date = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.println(id+"\t"+name+"\t"+sex+"\t"+date+"\t"+phone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(set,preparedStatement,connection);
        }

    }

    @Test
    public void testDML() {//insert , update, delete
        Connection connection = null;
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            connection=JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"周星驰");
            preparedStatement.setInt(2,4);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}
