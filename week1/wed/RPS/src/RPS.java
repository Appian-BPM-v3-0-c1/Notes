import java.util.Scanner;

public class RPS {

    public void startGame() {

        char user = ' ';
        int userwins = 0;
        int cpuwins = 0;
        int draws = 0;

        System.out.println("Welcome to RPS");

        while (user != 'x') {

            int cpu = getRandomNumber();
            int round = 0;
            Scanner scan = new Scanner(System.in);

            System.out.println("\nPick r (rock) p (paper) s (scissor) x (exit).");

            user = scan.nextLine().charAt(0);

            if (user == 'r' && cpu == 0) {
                System.out.println("DRAW!");
                draws = draws + 1;
            } else if (user == 'r' && cpu == 1) {
                System.out.println("CPU WINS!");
                cpuwins = cpuwins + 1;
            } else if (user == 'r' && cpu == 2) {
                System.out.println("PLAYER WINS!");
                userwins = userwins + 1;
            } else if (user == 's' && cpu == 0) {
                System.out.println("CPU WINS!");
                cpuwins = cpuwins + 1;
            } else if (user == 's' && cpu == 1) {
                System.out.println("PLAYER WINS!");
                userwins = userwins + 1;
            } else if (user == 's' && cpu == 2) {
                System.out.println("DRAW");
                draws = draws + 1;
            } else if (user == 'p' && cpu == 0) {
                System.out.println("PLAYER WINS!");
                userwins = userwins + 1;
            } else if (user == 'p' && cpu == 1) {
                System.out.println("CPU WINS!");
                cpuwins = cpuwins + 1;
            } else if (user == 'p' && cpu == 2) {
                System.out.println("DRAW");
                draws = draws + 1;
            } else if (user == 'x') {
                System.out.println("Thank you for playing!");
            } else {
                System.out.println("You have chosen poorly.");
            }

        }

        System.out.println("\n\033[4;2m" + "FINAL SCORES" + "\033[0m");
        System.out.println("\nTotal Player wins: " + userwins + ".");
        System.out.println("Total CPU wins: " + cpuwins + ".");
        System.out.println("Total Draws: " + draws + ".");

    }

    public int getRandomNumber() {
        return (int) (Math.random() * 3);
    }
}
