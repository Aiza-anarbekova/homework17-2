package com.compan;

public class Circle extends Shape{
    private int r;
    private  int d;
    public  final double pi=3.14;

    public Circle(int r, int d) {
        this.r = r;
        this.d = d;

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public double getperimet() {
        return 2*r*pi;
    }
}
