package com.itheima.reflection;

import com.itheima.entity.Hero;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/18 11:14
 */
public class ClassConfig {

    public static void main(String[] args) {
        Hero hero = getHero();
        hero.setName("456");

        System.out.println(hero.toString());

//        try {
//            Class ch = Class.forName("com.itheima.entity.ADHero");
//            Constructor c = ch.getConstructor();
//            Hero hero = (Hero) c.newInstance();
//            System.out.println(hero);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    public static Hero getHero() {
        File f = new File("F:\\workspace\\heima\\src\\hero");

        try (FileReader reader = new FileReader(f)) {
            String className = null;
            char[] cs = new char[(int) f.length() - 1];
            reader.read(cs);
            className = new String(cs);
            Class h = Class.forName(className);
            Constructor c = h.getConstructor();
            Hero hero = (Hero) c.newInstance();
            return hero;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
