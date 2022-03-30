import java.util.Comparator;

public class Rectangle {
        private String name;
        private int length;
        private int width;


public Rectangle() {

}

public Rectangle(String name, int length, int width) {
    this.name = name;
    this.length = length;
    this.width = width;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public int findArea() {
        return (length*width);
    }

    public int findPerimeter() {
        return (length+length+width+width);
    }

    public boolean findArea(Rectangle[] arr, Comparator comparator) {
        if(findArea() < findArea()){
            return true;
        } else {
            return false;
        }
    }

}