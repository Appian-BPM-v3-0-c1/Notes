public class Rectangle extends Shape {
    private double height;
    private double length;
    private double Area;

    public double Rectangle(double height, double length) {

        System.out.println ("height:");
        System.out.println ("length:");
        Area = (length * height);
        return Area;
        System.out.println ("Area:");
        }
    }
