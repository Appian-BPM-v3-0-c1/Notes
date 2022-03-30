package com.revature.abstraction;

public abstract class Shape extends Object {
    protected double circumference;
    protected double area;
    protected String name;

    public Shape(){

    }

    public Shape(String name, double circumference, double area) {

    }
    protected abstract double calculateArea();
    protected abstract double calculateCircumference();
}


/*package com.revature.abstraction;

public abstract class Shape extends Object {
    protected double circumference;
    protected double area;
    protected String name;

    public Shape(){

    }

    public Shape(String name, double circumference, double area){
        this.name = name;
        this.circumference = circumference;
        this. area = area;
    }


    @Override
    protected abstract double calculateCircumference(double circumference){
        this.circumference = circumference;
        return circumference;
    }
    @Override
    protected abstract double calculateArea(double area){
        this.area = area;
        return area;
    }

}*/
