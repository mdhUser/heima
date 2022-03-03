package com.itheima.other.exam.util;

import com.itheima.other.exam.service.MathDemo;

public class Divide extends MathDemo {


    public Divide(double a, double b) {
        super(a, b);
    }

     public Divide() {
     }

    @Override
    public double calculate() {
        return a/b;
    }

    @Override
    public String getQuestion() {
        return a+"÷"+b+"=?";
    }
}
