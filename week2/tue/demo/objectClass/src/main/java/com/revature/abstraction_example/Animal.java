package com.revature.abstraction_example;

/* Abstract class is used to hide important data from the outside world.
 * Think of it like a parent protecting their child.
 * Abstract class allows for more flexibility. You can have contract methods, or you can have implemented methods.
 * Attributes under abstract class needs to be protected.
 */

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
