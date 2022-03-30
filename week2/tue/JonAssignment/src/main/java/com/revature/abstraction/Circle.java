package com.revature.abstraction;

public class Circle extends Shape {
    private double radius;
    public Circle () {
        super();
    }
    public Circle(double rad) {
        super();
        this.radius = rad;
    }
    protected double getRadius() {
        return radius;
    }
    protected void setRadius(double c) {
        this.radius = c;
    }
    @Override
    protected double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
    protected double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
