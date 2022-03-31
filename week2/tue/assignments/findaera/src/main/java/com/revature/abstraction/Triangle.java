package com.revature.abstraction;
import static java.lang.Math.sqrt;

public class Triangle extends Shape
{

    private double height;
    private double base;

    public Triangle() {
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    protected double calculateArea()
    {
        return Math.sqrt((double) 3/4) * (height * height);
    }

    @Override
    protected double calculateCircumference()
    {
        return height*3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

}

