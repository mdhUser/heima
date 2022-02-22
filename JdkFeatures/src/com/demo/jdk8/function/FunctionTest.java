package com.demo.jdk8.function;

import java.util.function.Function;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/22 21:36
 */
public class FunctionTest {


    public static void main(String[] args) {
        test("maxwell", new FunctionDemo());
        Function<Integer, Integer> func = a -> a * 100;
        int a = func.apply(10);
        System.out.println("a = " + a);

    }

    public static void test(String input, Function demo) {
        System.out.println(demo.apply(input));
    }

}
