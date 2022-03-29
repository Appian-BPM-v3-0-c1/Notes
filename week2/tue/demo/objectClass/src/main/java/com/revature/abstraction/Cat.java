package com.revature.abstraction;

public class Cat extends Animal {
    private String whiskers;
    private String claws;

    public Cat() {
        super();
    }

    public Cat(String whiskers, String claws) {
        this.whiskers = whiskers;
        this.claws = claws;
    }

    public Cat(String name, int age, String whiskers, String claws) {
        super(name, age);
        this.whiskers = whiskers;
        this.claws = claws;
    }

    @Override
    protected void speak() {
        System.out.println("MEOW!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
