package com.revature.abstraction;

public class Rectangle {
    private double height;
    private double width;
    public Rectangle() {
        super();
    }
    public Rectangle(double h, double w) {
        super();
        this.height = h;
        this.width = w;
    }
    protected double getHeight() {
        return height;
    }
    protected double getWidth() {
        return width;
    }
    protected void setHeight(double height) {
        this.height = height;
    }
    protected void setWidth(double width) {
        this.width = width;
    }
    protected double calculateArea() {
        return height * width;
    }
    protected double calculateCircumference() {
        return 2 * (height + width);
    }
}
