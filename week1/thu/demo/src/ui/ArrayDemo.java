package ui;

import java.util.Scanner;

public class ArrayDemo {
    public void start() {
        //Create an arr of Strings with the size 12
        String[] strs = new String[12];

        Scanner scan = new Scanner(System.in);

        //Get the user input (jan - dec)
        //Store the user input into the string array
        String userInput = "";

        for (int i = 0; i < strs.length; i++) {
            System.out.println("Enter a month:");
            userInput = scan.nextLine();
            strs[i] = userInput;
        }

        //Printout array with the user input

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        //Printout all the even months '
        System.out.println("\nEven months: ");
        for (int i = 0; i < strs.length; i++) {
            if (i % 2 != 0) {
                System.out.println(strs[i]);
            }
        }

        //Printout all the odd months
        System.out.println("\nOdd months: ");
        for (int i = 0; i < strs.length; i++) {
            if (i % 2 == 0) {
                System.out.println(strs[i]);
            }
        }
    }
}
