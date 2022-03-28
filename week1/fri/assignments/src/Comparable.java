public class Comparable {

    public static boolean isLessThan(Rectangle rect1, Rectangle rect2) {
        if (rect1.getArea() < rect2.getArea()) {
            return true;
        }
        return false;
    }
}


