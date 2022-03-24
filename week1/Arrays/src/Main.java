import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create String with the size of 12
        String[] userInput = new String[12];
        //get the user input
        String month = " ";

        Scanner input = new Scanner(System.in);

        //store in the user input inside of an array using a for loop
        for (int i = 0; i < userInput.length; i++) {

            System.out.println("Enter Month....Jan - Dec");

            month = input.nextLine();
            userInput[i] = month;

        }
        //print array using for loop
        for (int i = 0; i < userInput.length; i++) {
            System.out.println(userInput[i]);
        }
        //print even numbered months from array
        System.out.println("\nPrint Even Months");

        for(int i = 0; i <= userInput.length; i++) {
            if(i % 2 != 0) {
                System.out.println(userInput[i]);
            }
        }

        //print odd months
        System.out.println("\nPrint Odd Months");
        for(int i = 0; i < userInput.length; i++) {
            if (i % 2 == 0) {
                System.out.println(userInput[i]);
            }
        }
    }
}
