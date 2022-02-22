package com.demo.jdk8;

import java.util.Optional;

/**
 * @description: Optional类操作
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/22 8:56
 */
public class OptionalDemo {


    public static void main(String[] args) {

        Hero hero = null;
        Optional<Hero> opt = Optional.ofNullable(hero);
        System.out.println(opt.isPresent());

    }


}
