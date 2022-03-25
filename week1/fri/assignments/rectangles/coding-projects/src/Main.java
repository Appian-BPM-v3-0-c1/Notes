import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectArr = new Rectangle[10];
        Rectangle rect = new Rectangle();
        Scanner scan = new Scanner(System.in);
        Random randNo = new Random();
        Comparator comp = new Comparator();

        for (int i = 0; i < rectArr.length; i++) {
            System.out.println("Please name your rectangle:");
            String name = scan.next();
            int width = randNo.nextInt(200);
            int len = randNo.nextInt(200);

            rect = new Rectangle(name, width, len);
            rectArr[i] = rect;

        }

        System.out.println(Arrays.toString(rectArr));
        System.out.println();
        System.out.println("The largest rectangle is: " + rect.findMaxArea(rectArr, comp));




    }
}
