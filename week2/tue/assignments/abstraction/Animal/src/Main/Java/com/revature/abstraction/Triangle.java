package com.revature.abstraction;

public class Triangle extends Shape {
    private double height;
    private double base;


    public Triangle(){
        super();
    }

    public Triangle(double height, double base){
        super();
        this.height = height;
        this.base=base;
    }

    public Triangle(String name, double circumference, double area){
        super(name, circumference, area);
        this.height=height;
        this.base=base;

    }

    protected double getHeight(){
        return height;
    }


    protected double getBase(){
        return base;
    }

    protected void setHeight(double e){
        this.height=e;
    }

    protected void setBase(double b){
        this.base=b;
    }


    /*protected Triangle(double e, double b){
        super.calculateCircumference(base + height);
        super.calculateArea(base*height);
    }*/

    @Override
    protected double calculateArea(){
        return base+height;
    }

    @Override
    protected double calculateCircumference(){
        return base*height;
    }

}
