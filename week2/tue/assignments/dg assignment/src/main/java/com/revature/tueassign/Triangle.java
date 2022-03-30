package com.revature.tueassign;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{

    private double height;


    public Triangle() {
        super();
    }

    public Triangle(double height) {
        this.height = height;
    }

    @Override
    protected double calculateArea() {
        return Math.sqrt((double) 3/4) * (height * height);
    }

    @Override
    protected double calculateCircumference() {
        return height*3;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
