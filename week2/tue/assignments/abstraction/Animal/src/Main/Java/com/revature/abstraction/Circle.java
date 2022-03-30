package com.revature.abstraction;

public class Circle extends Shape {
    private double radius;


    public Circle(){
        super();
    }

    public Circle(double rad){
        super();
        this.radius=rad;
    }


    protected double getRadius(){
        return radius;
    }


    protected void setRadius(double c){
        this.radius=c;
    }

    /*protected Circle(double radius){
        super.calculateCircumference(radius);
        super.calculateArea(Math.PI*radius);
    }*/

    @Override
    protected double calculateArea(){
        return Math.PI*radius;
    }

    @Override
    protected double calculateCircumference(){
        return 2 * Math.PI*radius;
    }
}
