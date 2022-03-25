//Create a Dog Class with attributes
public class Dog {
    private String breed;
    private String color;
    private String size;
    private String hair;
    private String name;
    String behavior;

    public Dog() {

    }

    public Dog(String breed, String color, String size, String hair, String name, String behavior) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.hair = hair;
        this.name = name;
        this.behavior = behavior;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hair='" + hair + '\'' +
                ", name='" + name + '\'' +
                ", behavior='" + behavior + '\'' +
                '}';
    }
}


