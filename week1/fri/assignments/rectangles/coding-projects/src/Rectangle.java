public class Rectangle {

    private String name;
    private int length;
    private int width;
    private int perimeter;
    private int area;

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

    public int getArea() {
        area = this.length * this.width;
        return area;
    }

    public int getPerimeter() {
        perimeter = (this.length * 2) + (this.width * 2);
        return perimeter;
    }

    public Rectangle findMaxArea(Rectangle[] rectArr, Comparator comp) {
        Rectangle max = rectArr[0];

        for (int i = 0; i < rectArr.length; i++) {
            if (comp.isLessThan(max, rectArr[i])) {
                max = rectArr[i];
            }
        }

        return max;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
