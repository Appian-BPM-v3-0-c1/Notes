package com.revature.abstraction;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle c = new Circle();
    @Test
    public void calculateArea() {
        c.setRadius(5.0);
        Assert.assertEquals(78.54,c.calculateArea(),0.2);
        c.setRadius(8.0);
        Assert.assertEquals(7.99,c.getRadius(),0.2);
    }

    @Test
    public void calculateCircumference() {
        c.setRadius(8);
        Assert.assertEquals(201.06,c.calculateArea(),0.2);
        c.setRadius(5);
        Assert.assertEquals(5.199,c.getRadius(),0.2);
    }
}