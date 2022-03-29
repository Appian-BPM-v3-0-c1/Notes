
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Rectangle[] arr = new Rectangle[3];
        Scanner scan = new Scanner(System.in);
        Comparable comp = new Comparable();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter in name, width, and length:");
            rect = new Rectangle(scan.next(), scan.nextInt(), scan.nextInt());
            arr[i] = rect;
        }

        System.out.println(rect.findMaxArea(arr, comp));
    }
}
