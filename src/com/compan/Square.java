package com.compan;

public class Square extends Shape{
    private  int a;
    private  int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getperimet() {
        return a+b;
    }
}
