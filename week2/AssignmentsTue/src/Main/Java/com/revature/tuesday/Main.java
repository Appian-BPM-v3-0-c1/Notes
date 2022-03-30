package com.revature.tuesday;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Rectangle length and width");
        Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());
        System.out.println("The area is " + rectangle.calculatedArea());
        System.out.println("The perimeter is " + rectangle.calculatedCircumference());

        System.out.println("Circle radius to find area and circumference.");
        Circle circle = new Circle(input.nextDouble());
        System.out.println("The area is " + circle.calculatedArea());
        System.out.println("The Circumference is " +circle.calculatedCircumference());


        System.out.println("Triangle height and base");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble());
        System.out.println("The area is " + triangle.calculatedArea());
        System.out.println("The perimeter is " + triangle.calculatedCircumference());

    }


}
