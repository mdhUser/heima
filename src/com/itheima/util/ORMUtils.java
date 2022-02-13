package com.itheima.util;

import com.itheima.enetiy.Hero;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: orm
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/13 19:37
 */
public class ORMUtils {

    private static void connect(String sql) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdh?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC", "root", "root"); Statement statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void add(Hero h) {

        String sql = "insert into hero values(null," + "'" + h.getName() + "'" + "," + h.getHp() + "," + h.getArmor() + "," + h.getMoveSpeed() + "," + h.getDamage() + ")";
        connect(sql);

    }

    public static void delete(Hero h) {
        String sql = "delete from hero where id=" + h.getId();
        connect(sql);
    }

    public static void update(Hero h) {
        String sql = "update hero set name=" + "'" + h.getName() == null ? null : h.getName()
                + "'" + ",hp=" + h.getHp() == null ? null : h.getHp()
                + ",armor=" + h.getArmor() == null ? null : h.getArmor()
                + ",move_speed=" + h.getMoveSpeed() == null ? null : h.getMoveSpeed()
                + ",damage=" + h.getDamage() == null ? null : h.getDamage() + "where id=" + h.getId();
        connect(sql);
    }

    public static List<Hero> heroes(int skip, int total) {
        List<Hero> heroes = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mdh?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC", "root", "root"); Statement statement = connection.createStatement()) {
            statement.execute("select * from hero limit " + skip + "," + total);
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                Hero hero = new Hero();
                hero.setId(rs.getInt(1));
                hero.setName(rs.getString(2));
                hero.setHp(rs.getDouble(3));
                hero.setArmor(rs.getDouble(4));
                hero.setMoveSpeed(rs.getLong(5));
                hero.setDamage(rs.getDouble(6));
                heroes.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return heroes;
    }

    public static void main(String[] args) {

        List<Hero> list = heroes(10, 5);
        list.stream().forEach(l -> System.out.println(l));

        Hero h = new Hero();
        h.setName("艾米丽");
        h.setMoveSpeed(4220);
        h.setArmor(8.20);
        add(h);
        Hero h2 = new Hero();
        h2.setId(21);
        h2.setArmor(0);
        update(h2);
        Hero h3 = new Hero();
        h3.setId(44);
        delete(h3);

    }

}