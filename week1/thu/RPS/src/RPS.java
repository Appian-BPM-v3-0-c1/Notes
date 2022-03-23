import java.util.Scanner;
import java.util.Random;

public class RPS {

    public void startGame() {

        int uScore = 0;
        int oScore = 0;
        int dScore = 0;

        while (true) {

            Random rand = new Random();
            int upperBound = 3;
            int random = rand.nextInt(upperBound);

            char user = ' ';
            System.out.println("You: " + uScore);
            System.out.println("Opponent: " + oScore);
            System.out.println("Ties: " + dScore);
            System.out.println();
            System.out.println("Instructions: Choose [R]ock, [P]aper, [S]cissors, or E[x]it.");

            Scanner input = new Scanner(System.in);

            user = input.nextLine().charAt(0);

            if ((user == 'r' || user == 'R') && random == 0) {
                System.out.println("It's a tie.");
                dScore++;

            } else if ((user == 'r' || user == 'R') && random == 1) {
                System.out.println("Opponent wins.");
                oScore++;

            } else if ((user == 'r' || user == 'R') && random == 2) {
                System.out.println("Congratulations. You won.");
                uScore++;

            } else if ((user == 'p' || user == 'P') && random == 0) {
                System.out.println("Congratulations. You won.");
                uScore++;

            } else if ((user == 'p' || user == 'P') && random == 1) {
                System.out.println("It's a tie.");
                dScore++;

            } else if ((user == 'p' || user == 'P') && random == 2) {
                System.out.println("Opponent wins.");
                oScore++;

            } else if ((user == 's' || user == 'S') && random == 0) {
                System.out.println("Opponent wins.");
                oScore++;

            } else if ((user == 's' || user == 'S') && random == 1) {
                System.out.println("Congratulations. You win.");
                uScore++;

            } else if ((user == 's' || user == 'S') && random == 2) {
                System.out.println("It's a tie.");
                dScore++;

            } else if (user == 'x' || user == 'X') {
                System.out.println("Final Score");
                System.out.println("You: " + uScore);
                System.out.println("Opponent: " + oScore);
                System.out.println("Ties: " + dScore);
                System.exit(0);
                input.close();

            } else {
                System.out.println("Invalid input. Please try again.");

            }


        }

    }

}
