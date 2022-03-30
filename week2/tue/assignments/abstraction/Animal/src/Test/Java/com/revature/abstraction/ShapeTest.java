package com.revature.abstraction;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {

    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();


    @Test
    public void calculateCircumference(){
        double test1 = 180;
        double test2 = 20;
        double test3 = 0;
        double test4 = 5;
        double test5 = 34;

        Assert.assertNotEquals(179, circle.calculateCircumference());
        Assert.assertNotEquals(179, rectangle.calculateCircumference());
        Assert.assertNotEquals(179, triangle.calculateCircumference());
        Assert.assertNotEquals(20, circle.calculateArea());
        Assert.assertNotEquals(0, rectangle.calculateArea());
        Assert.assertNotEquals(5, triangle.calculateArea());

    }
}
