package com.revature.abstraction;

public class Rectangle extends Shape{

    private double height;
    private double length;

    public Rectangle() {
        super();
    }

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    protected double calculateArea() {
        return height*length;
    }

    @Override
    protected double calculateCircumference() {
        return (2*height)+(2*length);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}