package com.revature.abstraction;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle = new Rectangle();
    DecimalFormat df = new DecimalFormat("0.00");

    @Test
    public void getHeight() {
    }

    @Test
    public void getWidth() {
    }

    @Test
    public void setHeight() {
    }

    @Test
    public void setWidth() {
    }

    @Test
    public void calculateArea() {
        rectangle.setHeight(180.0);
        rectangle.setWidth(180.0);

        Assert.assertEquals(360, Double.parseDouble(df.format(rectangle.calculateArea())), 0);

        rectangle.setHeight(90.0);
        rectangle.setWidth(90.0);

        Assert.assertEquals(180, Double.parseDouble(df.format(rectangle.calculateArea())), 0);

        rectangle.setHeight(270.0);
        rectangle.setWidth(90.0);

        Assert.assertEquals(360, Double.parseDouble(df.format(rectangle.calculateArea())), 0);

        rectangle.setHeight(-1.0);
        rectangle.setWidth(-10.0);

        Assert.assertEquals(-11, Double.parseDouble(df.format(rectangle.calculateArea())), 0);

        rectangle.setHeight(56.0);
        rectangle.setWidth(34.0);

        Assert.assertEquals(90, Double.parseDouble(df.format(rectangle.calculateArea())), 0);

    }

    @Test
    public void calculateCircumference() {

        rectangle.setHeight(180.0);
        rectangle.setWidth(180.0);

        Assert.assertEquals(32400.0, Double.parseDouble(df.format(rectangle.calculateCircumference())), 0);

        rectangle.setHeight(90.0);
        rectangle.setWidth(90.0);

        Assert.assertEquals(8100.0, Double.parseDouble(df.format(rectangle.calculateCircumference())), 0);

        rectangle.setHeight(270.0);
        rectangle.setWidth(90.0);

        Assert.assertEquals(24300.0, Double.parseDouble(df.format(rectangle.calculateCircumference())), 0);

        rectangle.setHeight(-1.0);
        rectangle.setWidth(-10.0);

        Assert.assertEquals(10, Double.parseDouble(df.format(rectangle.calculateCircumference())), 0);

        rectangle.setHeight(56.0);
        rectangle.setWidth(34.0);

        Assert.assertEquals(1904.0, Double.parseDouble(df.format(rectangle.calculateCircumference())), 0);
    }
}