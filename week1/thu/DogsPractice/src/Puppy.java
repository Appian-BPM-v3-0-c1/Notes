public class Puppy {

    private String name;
    private String breed;
    private String color;
    private String size;
    private String hair;

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

    public Puppy() {
    }

    public Puppy(String name, String breed, String color, String size, String hair) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Puppy:\n" +
                "name='" + name + '\'' +
                ", \nbreed='" + breed + '\'' +
                ", \ncolor='" + color + '\'' +
                ", \nsize='" + size + '\'' +
                ", \nhair='" + hair + '\'';
    }
}
