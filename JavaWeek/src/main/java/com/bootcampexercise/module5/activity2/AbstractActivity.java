package com.bootcampexercise.module5.activity2;

public class AbstractActivity {

    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();

        // set and print color
        rectangle.setColor("Blue");
        System.out.println("Rectangle color: " + rectangle.getColor());

        // print area
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        // print perimeter
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        System.out.println("-------------------------");

        Circle circle = new Circle();

        // set and print color
        circle.setColor("Red");
        System.out.println("Circle color: " + circle.getColor());

        // print area
        System.out.println("Circle area: " + circle.calculateArea());

        // print perimeter
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
    }
}
