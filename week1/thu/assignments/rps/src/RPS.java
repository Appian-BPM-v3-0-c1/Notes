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
        String cpuResult = null;
        if (cpu == 0) {
            cpuResult = "CPU has Rock";
        } else if (cpu == 1) {
            cpuResult = "CPU has Paper";
        } else if (cpu == 2) {
            cpuResult = "CPU has Scissors";
        }
        char user = ' ';
        boolean isRPS = false;
        boolean gameOver = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to RPS");
        do {
            System.out.println("\nPick r (rock) p (paper) s (scissor) x (exit)");
            user = scan.nextLine().charAt(0);
            if (user == 'r' || user == 'p' || user == 's' || user == 'x')
            {
                isRPS = true;
            }
        } while (!isRPS);
        if (user == 'r') {
            System.out.println(cpuResult);
            if (cpu == 0) {
                System.out.println("DRAW!");
            } else if (cpu == 1) {
                System.out.println("CPU WIN!");
            } else if (cpu == 2) {
            System.out.println("PLAYER WIN!");
            }
            gameOver = true;
        } else if (user == 'p') {
            if (cpu == 0) {
                System.out.println("PLAYER WIN!");
            } else if (cpu == 1) {
                System.out.println("DRAW!");
            } else if (cpu == 2) {
                System.out.println("CPU WIN!");
            }
            gameOver = true;
        } else if (user == 's') {
            if (cpu == 0) {
                System.out.println("CPU WIN!");
            } else if (cpu == 1) {
                System.out.println("PLAYER WIN!");
            } else if (cpu == 2) {
                System.out.println("DRAW!");
            }
            gameOver = true;
        } else if (user == 'x') {
            gameOver = true;
        }
        if (gameOver) {
            System.out.println("GAME OVER!");
        }
    }

    public int getRandomNumber() {
        return (int) (Math.random() * 3);
    }
}
