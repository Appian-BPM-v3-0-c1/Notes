package com.revature.tueassign;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        System.out.println("Circle 1's area: " + c1.calculateArea());
        System.out.println("Circle 1's circumference: " + c1.calculateCircumference());

        Rectangle r1 = new Rectangle(5, 5);
        System.out.println("Rectangle 1's area: " + r1.calculateArea());
        System.out.println("Rectangle 1's perimeter: " + r1.calculateCircumference());

        Triangle t1 = new Triangle(15);
        System.out.println("Triangle 1's area: " + t1.calculateArea());
        System.out.println("Triangle 1's perimeter: " + t1.calculateCircumference());

    }
}
