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
        boolean isRPS = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to RPS");
        do {
            System.out.println("\nPick r (rock) p (paper) s (scissor) x (exit)");
            user = scan.nextLine().charAt(0);
            if (user == 'r' || user == 'p' || user == 's' || user == 'x')
            {
                isRPS = true;
            }
        } while (isRPS == false);
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
