package com.revature.tuesday;

public class Triangle extends Shape {
    private double height = 10;
    private double base = 20;



    public Triangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }



    @Override
    protected double calculatedArea() {
        return (base*height)/2;
    }

    @Override
    protected double calculatedCircumference() {
        return base*3;
    }
}
