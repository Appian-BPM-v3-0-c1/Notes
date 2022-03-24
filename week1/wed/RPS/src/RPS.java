import java.util.Scanner;

public class RPS {

    public void startGame() {

        char user = ' ';
        int userwins = 0;
        int cpuwins = 0;
        int draws = 0;

        System.out.println("Welcome to ROCK PAPER SCISSORS!");
        System.out.println("CAN YOU BEAT THE COMPUTER?");
        System.out.println("LET'S BEGIN!");

        do {

            int cpu = getRandomNumber();
            int round = 0;
            Scanner scan = new Scanner(System.in);

            System.out.println("\nCHOOSE ONE OF THE FOLLOWING:");
            System.out.println("[r] for ROCK");
            System.out.println("[p] for PAPER");
            System.out.println("[s] for SCISSORS");
            System.out.println("[x] to EXIT");

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
                System.out.println("IT IS A DRAW!");
                draws = draws + 1;
            } else if (user == 'x') {
                System.out.println("Thank you for playing!");
            } else {
                System.out.println("You have chosen poorly.");
            }

        System.out.println("\n\033[4;2m" + "FINAL SCORES" + "\033[0m");
        System.out.println("Total Player wins: " + userwins + ".");
        System.out.println("Total CPU wins: " + cpuwins + ".");
        System.out.println("Total Draws: " + draws + ".");
        if (userwins < cpuwins) {
            System.out.println("YOU'RE LOSING!");
        } else if (cpuwins < userwins){
            System.out.println("YOU'RE WINNING!");
        } else {
            System.out.println("IT'S A TIE!");
        }
        } while (user != 'x');

        while (user == 'x') {
            System.out.println("\n!!!"+"GAME OVER"+"!!!");
            if (userwins < cpuwins) {
                System.out.println("YOU LOSE!");
            } else if (cpuwins < userwins){
                System.out.println("WINNER WINNER WINNER!");
            } else {
                System.out.println("TYING IS NOT AN OPTION! YOU CAN DO BETTER!");
            } break;
        }

    }

    public int getRandomNumber() {
        return (int) (Math.random() * 3);
    }
}
