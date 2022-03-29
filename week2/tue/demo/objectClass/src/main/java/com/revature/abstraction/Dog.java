package com.revature.abstraction;

public class Dog extends Animal {
    private String hair;
    private String snout;

    public Dog() {
    }

    public Dog(String hair, String snout) {
        this.hair = hair;
        this.snout = snout;
    }

    public Dog(String name, int age, String hair, String snout) {
        super(name, age);
        this.hair = hair;
        this.snout = snout;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void speak() {
        System.out.println("WOOF!");
    }
}
