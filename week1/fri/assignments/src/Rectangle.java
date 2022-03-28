public class Rectangle {

    private String name;
    private int length;
    private int width;
    private int area;
    private int perimeter;

    public Rectangle() {
    }

    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this. width = width;
    }



    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return area;
    }

    public void setArea() {
        area = length * width;

    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int length, int width) {
        perimeter = (length*2) + (width*2);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                "\n";
    }
}
