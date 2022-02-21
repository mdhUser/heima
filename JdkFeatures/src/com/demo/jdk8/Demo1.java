package com.demo.jdk8;

import java.util.Comparator;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/21 9:15
 */
public class Demo1 {


    public static void main(String[] args) {


        Thread r1 = new Thread(() -> System.out.println("hello"));
        r1.start();



        Comparator<Integer> com = (o1, o2) -> Integer.compare(o1, o2);


    }


}
