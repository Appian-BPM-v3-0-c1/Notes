public class Comparable {
    public boolean isLessThanArea(Rectangle rect1, Rectangle rect2) {
        if (rect1.getArea() < rect2.getArea()) {
            return true;
        }
        return false;
    }
    public boolean isLessThanPerimeter(Rectangle rect1, Rectangle rect2) {
        if (rect1.getPerimeter() < rect2.getPerimeter()) {
            return true;
        }
        return false;
    }
}
