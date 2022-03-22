//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 5;
        int b = 7;
        int sum = a + b;
        System.out.println(sum);
        System.out.println("Please enter a number");
        int number = Integer.parseInt(in.nextLine());
        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else if (number % 2 == 1) {
            System.out.println("This number is odd");
        } else {
            System.out.println("Incorrect input. Please try again");
        }

        System.out.println("Please enter a word.");
        String word = in.nextLine();
        if (word.length() < 10) {
            System.out.println(word);
        } else {
            PrintStream var10000 = System.out;
            char var10001 = word.charAt(0);
            var10000.println(var10001 + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
        }

    }
}
