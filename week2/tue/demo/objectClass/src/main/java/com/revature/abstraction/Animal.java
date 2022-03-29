package com.revature.abstraction;

public abstract class Animal extends Object {
    protected String name;
    protected int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    protected abstract void speak();
}
