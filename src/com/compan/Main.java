package com.compan;

public class Main {

    public static void main(String[] args) {
        Triangle triangle=new Triangle(12,6,8);
        System.out.println(triangle.getperimet());

        Rectangle rectangle= new Rectangle(9,12);
        System.out.println(rectangle.getperimet());

        Square square= new Square(12,45);
        System.out.println(square.getperimet());

        Trapezoid trapezoid=new Trapezoid(23,21);
        System.out.println(trapezoid.getperimet());

        Circle circle= new Circle(23,12);
        System.out.println(circle.getperimet());


    }
}
