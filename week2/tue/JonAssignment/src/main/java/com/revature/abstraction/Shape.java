package com.revature.abstraction;

public abstract class Shape extends Object {
    protected int x;
    protected int y;
    public Shape() {
    }
    public Shape(int a,int b) {

    }

    protected abstract double calculateArea();

    protected abstract double calculateCircumference();
}
