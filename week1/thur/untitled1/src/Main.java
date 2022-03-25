import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] string = new String[12];
        String month = "";
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < string.length; i++) {
            System.out.println("Please print a month:");

            month = scan.nextLine();
            string[i] = month;
        }

        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }

        System.out.println("Even Months:");
        for (int i = 0; i < string.length; i++) {
            if (i % 2 != 0) {
                System.out.println(string[i]);
            }
        }

        System.out.println("Odd Months:");
        for (int i = 0; i < string.length; i++) {
            if (i % 2 == 0) {
                System.out.println(string[i]);
            }
        }

    }
}