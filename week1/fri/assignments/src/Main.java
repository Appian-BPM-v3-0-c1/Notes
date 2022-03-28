import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Comparable compare = new Comparable();
        Rectangle[] bank = new Rectangle[10];
        Rectangle maxA = bank[0];
        Rectangle maxP = bank[0];
        Scanner scan = new Scanner(System.in);
        

        for(int i = 0; i < bank.length; i++){

        System.out.println("Enter your rectangles' properties:\n" + "Name, length, and width");
        Rectangle rectangle = new Rectangle(scan.next(), scan.nextInt(), scan.nextInt());

        bank[i] = rectangle;
        }

        for(int i = 0; i < bank.length; i++) {
            for(int a = 0; a < bank.length; a++) {
                if (!Comparable.isLessThan(bank[i], bank[a])) {
                    maxA = bank[i];
                } else
                    continue;
            }
        }
        for(int i = 0; i < bank.length; i++) {
            for(int a = 0; a < bank.length; a++) {
                if (!Comparable.isLessThan(bank[i], bank[a])) {
                    maxA = bank[i];
                } else
                    continue;
            }
        }


        System.out.println(Arrays.toString(bank));
        System.out.println(maxA);
        System.out.println(maxP);


    }
}
