package models;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private String size;
    private String hair;
    private int age;

    public Dog() {

    }

    public Dog(String name, String breed, String color, String size, String hair, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.hair = hair;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hair='" + hair + '\'' +
                ", age=" + age +
                '}';
    }
}
