package com.itheima.pool;

import java.sql.*;

/**
 * @description: dsad
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/13 8:20
 */
public class Test {

    public static void main(String[] args) {
        String delete = "delete from hero limit ?";
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdh?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC"
                        , "root", "root");
                PreparedStatement ps = connection.prepareStatement(delete, Statement.RETURN_GENERATED_KEYS);
        ) {


            ps.setInt(1, 1);
            ps.execute();
            ResultSet resultSet = ps.getGeneratedKeys();
//            if (resultSet.next())
//                int id = resultSet.getInt(1);
//            System.out.println(id);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
