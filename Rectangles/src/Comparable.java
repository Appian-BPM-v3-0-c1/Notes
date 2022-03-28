

public class Comparable {
    Rectangle rectangle = new Rectangle();
    Rectangle rectangle2 = new Rectangle();

    public boolean isLessThanArea(Rectangle rectangle, Rectangle rectangle2){
        if(rectangle.findArea() < rectangle2.findArea()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLessThanPerimeter(Rectangle rectangle, Rectangle rectangle2) {
        if(rectangle.findPerimeter() < rectangle2.findPerimeter()) {
            return true;
        } else {
            return false;
        }
    }
}
