package com.revature.abstraction;

public class Circle extends Shape{

// Create variable for radius
    double radius;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }


    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }


    @Override
    protected double calculateCircumference()
    {
        return 2*3.14*(radius);
    }

    @Override
    protected double calculateArea()
    {
        return 3.14*(radius*radius);
    }
}
