public class Dog {
    private String name;
    private String breed;
    private String color;
    private String size;
    private String hair;
    private String age;
    public Dog(String name, String breed, String color, String size, String hair, String age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.hair = hair;
        this.age = age;
    }
    public Dog() {
    }
    public String toString() {
        return (this.name) + ", " + (this.breed) + ", " + (this.color) + ", " + (this.size) + ", " + (this.hair) + ", " + (this.age);
    }
}

