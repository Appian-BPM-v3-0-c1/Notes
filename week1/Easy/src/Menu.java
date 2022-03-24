
import java.util.Scanner;

public class Menu {
    public void startMenu() {
        boolean exit = false;
        int input = 0;

        Scanner scan = new Scanner(System.in);
        Problems problem = new Problems();

        do {
            System.out.println("Welcome to menu!");
            System.out.println("\n[1] Easy");
            System.out.println("[2] Moderate");
            System.out.println("[3] Hard");
            System.out.println("[4] Exit");

            input = scan.nextInt();

            if (input == 1) {
                System.out.println(problem.easy(1, 2));
            } else if (input == 2) {
                System.out.println(problem.moderate(2));
            } else if (input == 3) {
                System.out.println(problem.hard("localization"));
            } else if (input == 4) {
                exit = true;
                System.out.println("Goodbye!");
            }

        } while (exit == false);
    }
}