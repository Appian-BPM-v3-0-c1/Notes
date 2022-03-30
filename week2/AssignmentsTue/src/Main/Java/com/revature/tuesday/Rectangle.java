package com.revature.tuesday;

public class Rectangle extends Shape {
    private double height = 5;
    private double width = 10;

    public Rectangle(){
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    protected double calculatedArea() {
        return height*width;
    }

    @Override
    protected double calculatedCircumference() {
        return (height*2) + (width*2);
    }
}
