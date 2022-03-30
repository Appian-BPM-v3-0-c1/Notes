package com.revature.abstraction;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle r = new Rectangle();
    @Test
    public void calculateArea() {
        r.setHeight(2.0);
        r.setWidth(5.0);
        Assert.assertEquals(9.8,r.calculateArea(),0.2);
        r.setHeight(1.0);
        r.setWidth(1.0);
        Assert.assertEquals(0.8,r.getHeight(),0.2);
        Assert.assertEquals(0.8,r.getWidth(),0.2);
    }

    @Test
    public void calculateCircumference() {
        r.setHeight(2.0);
        r.setWidth(5.0);
        Assert.assertEquals(14.2,r.calculateCircumference(),0.2);
        r.setHeight(3.0);
        r.setWidth(3.0);
        Assert.assertEquals(2.81,r.getHeight(),0.2);
        Assert.assertEquals(3.19,r.getWidth(),0.2);
    }
}