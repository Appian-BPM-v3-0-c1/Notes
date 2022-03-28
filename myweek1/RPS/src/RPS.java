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

            System.out.println("Pick r (rock) p (paper) s (scissor) x (exit).");

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
            }

        }

        System.out.println("\nFINAL SCORES");
        System.out.println("\nTotal Player wins: " + userwins + ".");
        System.out.println("Total CPU wins: " + cpuwins + ".");
        System.out.println("Total Draws: " + draws + ".");

    }

    public int getRandomNumber() {
        return (int) (Math.random() * 3);
    }
}
