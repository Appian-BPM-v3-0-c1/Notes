package com.revature.tuesday;

public class Circle extends Shape {

    private double radius;

    public Circle(){
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }



    @Override
    protected double calculatedArea() {
        return 3.14*(radius*radius);
    }

    @Override
    protected double calculatedCircumference() {
        return (2*3.14)*(radius);
    }




}
