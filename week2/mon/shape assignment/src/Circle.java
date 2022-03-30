package com.revature.abstrraction;

import javafx.scene.shape.Shape;

public class Circle extends Shape {

    private double radius;

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    @Override
    protected void calculateArea() {
        area = Math.PI * radius * radius
        return area;

    }

}
    @Override
    protected void calculateCircumference(Object obj) {
        circumference = 2 * Math.PI * radius
        return circumference;

    }
}
