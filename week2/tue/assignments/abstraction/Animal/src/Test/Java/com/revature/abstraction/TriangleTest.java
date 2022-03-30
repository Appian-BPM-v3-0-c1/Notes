package com.revature.abstraction;

import org.junit.Test;
import org.junit.Assert;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle = new Triangle();
    DecimalFormat df = new DecimalFormat("0.00");

    @Test
    public void getHeight() {
    }

    @Test
    public void getBase() {
    }

    @Test
    public void setHeight() {
    }

    @Test
    public void setBase() {
    }

    @Test
    public void calculateArea() {

        triangle.setHeight(180.0);
        triangle.setBase(180.0);

        Assert.assertEquals(360, Double.parseDouble(df.format(triangle.calculateArea())), 0);

        triangle.setHeight(90.0);
        triangle.setBase(90.0);

        Assert.assertEquals(180, Double.parseDouble(df.format(triangle.calculateArea())), 0);

        triangle.setHeight(0.0);
        triangle.setBase(0.0);

        Assert.assertEquals(0, Double.parseDouble(df.format(triangle.calculateArea())), 0);

        triangle.setHeight(-180.0);
        triangle.setBase(-180.0);

        Assert.assertEquals(-360, Double.parseDouble(df.format(triangle.calculateArea())), 0);

        triangle.setHeight(-180.0);
        triangle.setBase(180.0);

        Assert.assertEquals(0, Double.parseDouble(df.format(triangle.calculateArea())), 0);


    }

    @Test
    public void calculateCircumference() {

        triangle.setHeight(180.0);
        triangle.setBase(180.0);

        Assert.assertEquals(32400.0, Double.parseDouble(df.format(triangle.calculateCircumference())), 0);

        triangle.setHeight(90.0);
        triangle.setBase(90.0);

        Assert.assertEquals(8100.0, Double.parseDouble(df.format(triangle.calculateCircumference())), 0);

        triangle.setHeight(0.0);
        triangle.setBase(0.0);

        Assert.assertEquals(0, Double.parseDouble(df.format(triangle.calculateCircumference())), 0);

        triangle.setHeight(-180.0);
        triangle.setBase(-180.0);

        Assert.assertEquals(32400.0, Double.parseDouble(df.format(triangle.calculateCircumference())), 0);

        triangle.setHeight(-180.0);
        triangle.setBase(180.0);

        Assert.assertEquals(-32400.0, Double.parseDouble(df.format(triangle.calculateCircumference())), 0);
    }
}