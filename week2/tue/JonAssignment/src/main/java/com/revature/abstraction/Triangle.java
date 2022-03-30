package com.revature.abstraction;

public class Triangle {
    private double height;
    private double base;
    public Triangle() {
        super();
    }
    public Triangle(double height,double base){
        super();
        this.height = height;
        this.base = base;
    }
    protected double getHeight() {
        return height;
    }
    protected double getBase() {
        return base;
    }
    protected void setHeight(double height) {
        this.height = height;
    }
    protected void setBase(double base) {
        this.base = base;
    }
    protected double calculateArea() {
        return 0.5*height*base;
    }
    protected double calculatePerimeter() {
        return base + Math.sqrt(Math.pow((0.5*base),2) + Math.pow(height,2));
    }
}
