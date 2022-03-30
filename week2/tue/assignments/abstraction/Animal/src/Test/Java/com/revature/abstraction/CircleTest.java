package com.revature.abstraction;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class CircleTest {

    Circle circle = new Circle();
    DecimalFormat df = new DecimalFormat("0.00");

    @Test
    public void getRadius() {
        double test1 = 180.0;
        double test2 = 20.0;
        double test3 = 0.0;
        double test4 = 5.0;
        double test5 = 34.0;
    }

    @Test
    public void setRadius() {
        double test1 = 180.0;
        double test2 = 20.0;
        double test3 = 0.0;
        double test4 = 5.0;
        double test5 = 34.0;
    }

    @Test
    public void calculateArea() {
        circle.setRadius(180);

        Assert.assertEquals(565.49, Double.parseDouble(df.format(circle.calculateArea())), 0);

        circle.setRadius(1.0);

        Assert.assertEquals(3.14, Double.parseDouble(df.format(circle.calculateArea())),0);

        circle.setRadius(0.0);

        Assert.assertEquals(0.0, Double.parseDouble(df.format(circle.calculateArea())),0);

        circle.setRadius(-1.0);

        Assert.assertEquals(-3.14, Double.parseDouble(df.format(circle.calculateArea())),0);

        circle.setRadius(-180.0);

        Assert.assertEquals(-565.49, Double.parseDouble(df.format(circle.calculateArea())),0);

    }

    @Test
    public void calculateCircumference() {
        circle.setRadius(180.0);

        Assert.assertEquals(1130.97, Double.parseDouble(df.format(circle.calculateCircumference())), 0);

        circle.setRadius(1.0);

        Assert.assertEquals(6.28, Double.parseDouble(df.format(circle.calculateCircumference())),0);

        circle.setRadius(0.0);

        Assert.assertEquals(0.0, Double.parseDouble(df.format(circle.calculateCircumference())),0);

        circle.setRadius(-1.0);

        Assert.assertEquals(-6.28, Double.parseDouble(df.format(circle.calculateCircumference())),0);

        circle.setRadius(-180.0);

        Assert.assertEquals(-1130.97, Double.parseDouble(df.format(circle.calculateCircumference())),0);
    }
}