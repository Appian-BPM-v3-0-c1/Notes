import java.util.Random;
public class Main {
    public static void main (String[] args) {
        Random random = new Random();
        Rectangle[] rArray = new Rectangle[10];
        Rectangle greatest = new Rectangle();
        for (int i = 0; i < 10; i++) {
            rArray[i] = new Rectangle("",random.nextInt(11),random.nextInt(11));
        }
        greatest = findMaxArea(rArray);
        System.out.println("Length: " + greatest.getLength());
        System.out.println("Width: " + greatest.getWidth());
        System.out.println("The biggest rectangle in this group has an area of: " + greatest.getArea());
        greatest = findMaxPerimeter(rArray);
        System.out.println("The biggest rectangle in this group has a perimeter of: " + greatest.getPerimeter());
    }
    public static Rectangle findMaxArea(Rectangle[] rArr) {
        CompareArea ca = new CompareArea();
        Rectangle r = rArr[0];
        int i = 0;
        while (i < 9) {
            if (ca.IsLessThan(rArr[i],rArr[i+1])) {
                r = rArr[i+1];
            }
            i++;
        }
        return r;
    }
    public static Rectangle findMaxPerimeter(Rectangle[] rArr) {
        ComparePerimeter cp = new ComparePerimeter();
        Rectangle r = rArr[0];
        int i = 0;
        while (i < 9) {
            if (cp.IsLessThan(rArr[i],rArr[i+1])) {
                r = rArr[i+1];
            }
            i++;
        }
        return r;
    }
}