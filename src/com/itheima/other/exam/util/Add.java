package com.itheima.other.exam.util;

import com.itheima.other.exam.service.MathDemo;

public class Add extends MathDemo {

    public Add(){
    }

    public Add(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return a+b;
    }

    @Override
    public String getQuestion() {
        return a+"+"+b+"=?";
    }
}
