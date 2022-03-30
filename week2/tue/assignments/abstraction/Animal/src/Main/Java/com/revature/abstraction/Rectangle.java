package com.revature.abstraction;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;


public class Rectangle extends Shape {
    private double height;
    private double width;


    public Rectangle(){
        super();
    }

    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }

    public Rectangle(String name, double circumference, double area){
        super(name, circumference, area);
        this.height=height;
        this.width=width;
    }

    //@Override
    protected double getHeight(){
        return height;
    }

    protected double getWidth(){
        return width;
    }


    protected void setHeight(double h){
        this.height=h;
    }


    protected void setWidth(double w){
        this.width=w;
    }


    /*protected Rectangle(double circumference, double area){
        super.calculateCircumference(height+width);
        super.calculateArea(height*width);

    }*/
    @Override
    protected double calculateArea(){
        return height+width;
    }

    @Override
    protected double calculateCircumference(){
        return height*width;
    }

}
