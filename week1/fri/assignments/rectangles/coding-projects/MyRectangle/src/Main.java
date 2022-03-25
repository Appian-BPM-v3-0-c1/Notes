import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Comparable compare = new Comparable();
        Rectangle[] bank = new Rectangle[3];
        Scanner scan = new Scanner(System.in);
        Rectangle maxP = bank[0];
        Rectangle maxA = bank[0];


        for (int i = 0; i < bank.length; i++) {
            System.out.println("Enter your rectangles' properties:");
            System.out.println("Name, Length, and Width");
            Rectangle rectangle = new Rectangle(scan.next(), scan.nextInt(), scan.nextInt());
            bank[i] = rectangle;
        }

        for (int i = 0; i < bank.length; i++) {
            for(int a = 0; a < bank.length; a++) {
                if (!compare.isLessThanArea(bank[i], bank[a])) {
                    maxA = bank[i];
                } else
                    continue;
            }
        }

        for (int i = 0; i < bank.length; i++) {
            for(int a = 0; a < bank.length; a++) {
                if (!compare.isLessThanPerimeter(bank[i], bank[a])) {
                    maxP = bank[i];
                } else
                    continue;
            }
        }

        System.out.println("Rectangles: " + Arrays.toString(bank));
        System.out.println("This is the max area: " + maxA);
        System.out.println("This is the max perimeter: " + maxP);



    }

}

