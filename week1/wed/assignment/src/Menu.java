import java.util.Scanner;

public class Menu {
    public void startMenu() {
        boolean exit = false;
        int input = 0;
        int a;
        int b;
        int binary = 0;
        String c;

        Scanner scan = new Scanner(System.in);
        Problems problem = new Problems();

        do {
            System.out.println("Which problem?");
            System.out.println("\n[1] Easy");
            System.out.println("[2] Moderate");
            System.out.println("[3] Hard");
            System.out.println("[4] Exit");

            input = scan.nextInt();

            if (input == 1) {
                System.out.println("Type in a number: ");
                a = scan.nextInt();
                System.out.println("Type in a second number: ");
                b = scan.nextInt();
                System.out.println("The sum of the two numbers is "+ problem.Easy(a,b));
            } else if (input == 2) {
                System.out.println("Type in a number: ");
                a = scan.nextInt();
                System.out.println (a + "is " + problem.Moderate(a));
            } else if (input == 3) {
                System.out.println("Type in a word: ");
                c = scan.next();
                System.out.println(problem.FinalBoss(c));
            } else if (input == 4) {
                exit = true;
                System.out.println("Goodbye!");
            }

        } while (exit == false);

    }
}
