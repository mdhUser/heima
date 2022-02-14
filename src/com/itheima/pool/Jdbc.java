package com.itheima.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/12 13:47
 */
public class Jdbc {

    public static void main(String[] args) {

        try ( Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdh?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC",
                "root", "root");
              Statement statement = connection.createStatement()){

            System.out.println("数据库连接成功，获取连接对象" + connection);
            int time=0;
            while (time<100){
                time++;
                String sql = "insert into hero (name,hp,armor,move_speed,damage) values("+"'hero"+time+"'"+","+100.25+","+45+","+25+","+100+")";
                statement.execute(sql);
                System.out.println("插入第"+time+"条sql");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}