public class Rectangle {
    private String name;
    private int length;
    private int width;
    public Rectangle() {}
    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
    public String getName() {
        return name;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea() {
        return this.length * this.width;
    }
    public int getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
