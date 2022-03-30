package com.revature.abstraction;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    Triangle t = new Triangle();
    @Test
    public void calculateArea() {
        t.setBase(2.0);
        t.setHeight(2.0);
        Assert.assertEquals(1.8,t.calculateArea(),0.2);
        t.setBase(5.0);
        t.setHeight(4.5);
        Assert.assertEquals(4.81,t.getBase(),0.2);
        Assert.assertEquals(4.31,t.getHeight(),0.2);
    }

    @Test
    public void calculatePerimeter() {
        t.setBase(2.0);
        t.setHeight(2.0);
        Assert.assertEquals(19.2,t.calculatePerimeter(),0.2);
        t.setBase(9.9);
        t.setHeight(0.1);
        Assert.assertEquals(10.09,t.getBase(),0.2);
        Assert.assertEquals(0.29,t.getHeight(),0.2);
    }
}