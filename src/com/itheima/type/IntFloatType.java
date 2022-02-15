package com.itheima.type;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description: 泛型练习
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/15 9:58
 */
public class IntFloatType<Letter> {

    private List<Letter> letters = new ArrayList<>();

    public void add(Letter l) {
        letters.add(l);
    }

    public void addAll(List<Letter> l) {
        letters.addAll(l);
    }

    public List<Letter> get() {
        return letters;
    }

    public static int check(int a){
        do {
            if (a > 80 || a < 1) {
                a = (int) (Math.random() * 500);
            }else {
                break;
            }
        } while (true);

      return a;
    }


    public static void main(String[] args) {

            int a1 = (int) (Math.random() * 500);
            int a2 = (int) (Math.random() * 500);
            int a3 = (int) (Math.random() * 500);
            int a4 = (int) (Math.random() * 500);
            int a5 = (int) (Math.random() * 500);

            int end1 = check(a1);
            int end2 = check(a1);
            int end3 = check(a1);
            int end4 = check(a1);
            int end5 = check(a1);



        IntFloatType<Integer> integerType = new IntFloatType<>();
        IntFloatType<Float> floatType = new IntFloatType<>();

        integerType.add(1);
        System.out.println("integerType = " + integerType.get().toString());
        floatType.add(52.45f);
        System.out.println("floatType = " + floatType.get().toString());

    }


}