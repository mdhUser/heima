package com.itheima.pool;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: dsad
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/13 8:20
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int[] num = new int[10];
        for (int i=0;i<num.length;i++){
            num[i]=(int)(100*Math.random());
            if (num[i]%2==0)
                list.add(num[i]);
        }


        int count=0;
       for (int i=0;i<num.length;i++){
           System.out.print(num[i]+"\t");
           count++;
           if (count%2==0){
               System.out.println();
           }
       }


    }

}
