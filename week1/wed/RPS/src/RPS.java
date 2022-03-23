import java.util.Random;
import java.util.Scanner;

public class RPS {
        public void game() {
        Scanner scan = new Scanner(System.in);
            Random r = new Random();
            String[] arr={"1", "2", "3"};

            //used to decide cpu choice with random number



            //scoreboard for player, cpu, and draw if both select the same choice

        int pscore = 0;
        int cscore = 0;
        int dscore = 0;

            System.out.println("This is a game of Rock, Paper, Scizzor!\nBelow is the list of options you can choose from:\n");
        while (true) { //loop continues to play game until user chooses 4 to exit the game
            int randomInt=r.nextInt(arr.length);

            // displays the list of options, the scores, and prompts the user to select a number
            System.out.println("[1] Rock     [2] Paper     [3] Scizzor     [4] Exit\n");
            System.out.println("Scores:\nPlayer: " + pscore + "     CPU: " + cscore + "     Draw: " + dscore);
            System.out.println("\nPlease type a number between 1 to 4:\n");
            int input = scan.nextInt();

            /* takes scanner input, but only if the number is between 1 and 4, otherwise the prompt
            "incorrect input, please try again........" will show up */

            if (input > 0 && input < 5) {
                if (input == 4) {
                    System.exit(0);
                } else if (randomInt == 0) {
                    System.out.println("CPU chose Rock\n");
                } else if (randomInt == 1) {
                    System.out.println("CPU chose Paper\n");
                } else if (randomInt == 2) {
                    System.out.println("CPU chose Scizzor\n");
                }

                // compares the user input with the cpu choice and adds score to board accordingly

                if (input == randomInt) {
                    System.out.println("It's a tie!\n");
                    dscore++;
                } else if (input == 1 && randomInt == 1) {
                    System.out.println("You lose, paper beats rock!\n");
                    cscore++;
                } else if (input == 1 && randomInt == 2) {
                    System.out.println("You win, rock beats scizzor!\n");
                    pscore++;
                } else if (input == 2 && randomInt == 0) {
                    System.out.println("You win, paper beats rock!\n");
                    pscore++;
                } else if (input == 2 && randomInt == 2) {
                    System.out.println("You lose, scizzor beats paper!\n");
                    cscore++;
                } else if (input == 3 && randomInt == 0) {
                    System.out.println("You lose, rock beats scizzor!\n");
                    cscore++;
                } else if (input == 3 && randomInt == 1) {
                    System.out.println("You win, scizzor beats paper!\n");
                    pscore++;
                }
            } else {
                System.out.println("Incorrect input, please try again.........\n");
            }
        }
    }
}