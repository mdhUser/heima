package com.itheima.pool;

import java.sql.*;

/**
 * @description: jdbc特性
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/13 10:52
 */
public class JdbcSpecial {


    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdh?characterEncoding=UTF-8&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC"
                        , "root", "root");
                PreparedStatement ps = connection.prepareStatement(sql);
                Statement statement = connection.createStatement();
        ) {




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
