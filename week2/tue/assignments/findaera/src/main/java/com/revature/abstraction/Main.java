package com.revature.abstraction;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println("Circle's area: " + circle.calculateArea());
        System.out.println("Circle's circumference: " + circle.calculateCircumference());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle 1's perimeter: " + rectangle.calculateCircumference());

        Triangle triangle = new Triangle(20, 10);

        System.out.println("Triangle's area: " + triangle.calculateArea());
        System.out.println("Triangle's perimeter: " + triangle.calculateCircumference());

    }
}

