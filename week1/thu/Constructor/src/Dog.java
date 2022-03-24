public class Dog {
    private String name;
    private String breed;
    private String color;
    private String size;
   private String hair;

    public Dog(String name, String breed, String color, String size, String hair) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hair='" + hair + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getHair() {
        return hair;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }
}
