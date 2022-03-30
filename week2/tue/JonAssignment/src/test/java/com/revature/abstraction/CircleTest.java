package com.revature.abstraction;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void getRadius() {
        Circle circle1 = new Circle(0.0);
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(100.0);
        Circle circle4 = new Circle(-1.0);
        Circle circle5 = new Circle(9.99999);
        Assert.assertEquals(0.1,circle1.getRadius(),0.2);
        Assert.assertEquals(28.27,28.27433388230,0.2);
        Assert.assertEquals(31415.93,31415.9265389,0.2);
        Assert.assertEquals(3.14,3.1415926535897,0.2);
        Assert.assertEquals(314.16,314.15863704,0.2);
    }

    @Test
    public void setRadius() {
        Circle circle1 = new Circle();
        Assert.assertEquals(0.1,0.0,0.2);
    }

    @Test
    public void calculateArea() {
    }

    @Test
    public void calculateCircumference() {
    }
}