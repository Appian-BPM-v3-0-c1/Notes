import java.util.Scanner;

public class RPS {
    public void startGame() {
        int cpu = getRandomNumber();
        char user = ' ';
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to RPS");
        System.out.println("\nPick r (rock) p (paper) s (scissor) x (exit)");

        user = scan.nextLine().charAt(0);

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
