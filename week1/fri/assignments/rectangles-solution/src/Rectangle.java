public class Rectangle {
    private String name;
    private int width;
    private int length;

    public Rectangle() {
    }

    public Rectangle(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public int getArea() {
        return width * length;
    }

    public int getPerimeter() {
        return (length + width) * 2;
    }

    public Rectangle findMaxArea(Rectangle[] arr, Comparable comp) {
        Rectangle max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (comp.isLessThan(max, arr[i])) {
                max = arr[i];
            }
        }

        return max;
    }
}
