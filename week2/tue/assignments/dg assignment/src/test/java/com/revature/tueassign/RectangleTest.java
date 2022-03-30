package com.revature.tueassign;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    Rectangle rect = new Rectangle();

    @Test
    void calculateArea() {
        rect.setHeight(10.0);
        rect.setLength(5.0);
        Assertions.assertEquals(50.0, rect.calculateArea());

        rect.setLength(20.0);
        rect.setHeight(0.0);
        Assertions.assertEquals(0.0, rect.calculateArea());


    }

    @Test
    void calculateCircumference() {
    }

    @Test
    void getHeight() {
    }

    @Test
    void setHeight() {
    }

    @Test
    void getLength() {
    }

    @Test
    void setLength() {
    }
}