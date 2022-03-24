import java.util.Random;
import java.util.Scanner;

public class MyRPS {
    public static void main(String[] args) {

        int pwins=0;
        int cwins=0;
        int nowins=0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("****Score Board****");
            System.out.println("Player  : " +pwins  );
            System.out.println("Computer: " +cwins  );
            System.out.println("Draw    : " +nowins  );
            System.out.println("*******************");


            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while(true) {
                System.out.println("Please enter your move (r, p, or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
                nowins++;
            }
            else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose!");
                    cwins++;

                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                    pwins++;
                }
            }

            else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("You win!");
                    pwins++;
                } else if (computerMove.equals("s")) {
                    System.out.println("You lose!");
                    cwins++;
                }
            }

            else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("You win!");
                    pwins++;

                } else if (computerMove.equals("r")) {
                    System.out.println("You lose!");
                    cwins++;
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}