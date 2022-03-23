<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        int input;
        String c;
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        Problems problems = new Problems();
        do {
            System.out.println("Which program");
            System.out.println("\n1. Easy");
            System.out.println("2. Moderate");
            System.out.println("3. Final Boss");
            input = s.nextInt();

            if (input == 1) {
                // Easy program
                System.out.println("Type in first number:");
                a = s.nextInt();
                System.out.println("Type in second number:");
                b = s.nextInt();
                System.out.println("The sum of the two numbers is: " + problems.easy(a, b));
                exit = true;
            }
            else if (input == 2) {
                // Moderate program
                System.out.println("Type in a number: ");
                a = s.nextInt();
                System.out.println(problems.moderate(a));
                exit = true;
            }
            else if (input == 3) {
                // Final boss program
                System.out.println("Type in a word: ");
                c = s.nextLine();
                2
                exit = true;
            }

        } while (exit == false);
        System.out.println("Goodbye!");
=======

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.startMenu();
>>>>>>> a80a60832bbe4576427b6dde33e9cacc40857ef5
    }
}
