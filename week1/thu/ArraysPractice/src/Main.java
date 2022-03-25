import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] stringArray = new String[12];

        String month = " ";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < stringArray.length; i++) {

            System.out.println("Please input a month: ");

            month = input.nextLine();
            stringArray[i] = month;

        }

        System.out.println("All months:");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        System.out.println("\nEven months:");

        for (int i = 0; i < stringArray.length; i++) {
            if (i % 2 != 0) {
                System.out.println(stringArray[i]);
            }
        }

        System.out.println("\nOdd months:");
        for (int i = 0; i < stringArray.length; i++) {
            if (i % 2 == 0) {
                System.out.println(stringArray[i]);
            }
        }





    }
}
