package com.itheima.homework;

import java.util.Date;

public class Demo {


    public static void main(String[] args) {

       Demo.Example demo = new Demo().new Example();
        Date now = new Date();
        System.out.println(now);

    }



    class Example{

       int name;

        {
            name=15;
        }

    }

}
