import java.util.Scanner;


/*
 * @TODO
 * Implement the rest of the game functionality for paper and scissor.
 * Add track player's win and cpu's win and draw.
 * Put this game into a loop until the player enter 'x' (exit).
 */
public class RPS {

    public void startGame() {
        int cpu = getRandomNumber();
        char user = ' ';
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to RPS")
        System.out.println("\nPick r (rock) p (paper) s (scissor) x (exit)");

        user = scan.nextLine().charAt(0);



        }

        if (user == 's' && cpu == 2) {
            System.out.println("Draw!");
        } else if (user == 's' && cpu == 1) {
            System.out.println("Player Win!");
        } else if (user == 's' && cpu == 0) {
            System.out.println("CPU Win!");
        }


        if (user == 'p' && cpu == 1) {
            System.out.println("DRAW!");
        } else if (user == 'p' && cpu == 2) {
            System.out.println("CPU Win!");
        } else if (user == 'p' && cpu == 0) {
        System.out.println("Player Win!");
        }


        if (user == 'r' && cpu == 0) {
            System.out.println("DRAW!");
        } else if (user == 'r' && cpu == 1) {
            System.out.println("CPU WIN!");
        } else if (user == 'r' && cpu == 2) {
            System.out.println("PLAYER WIN!");

        }
    }

    public int getRandomNumber() {
        return (int) (Math.random() * 3);
    }
}
