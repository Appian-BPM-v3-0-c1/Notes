import java.util.Scanner;

public class Game {

    public void startGame() {
        int cpu = getRandomNumber ();
        char user = ' ';
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Game");
        System.out.println("\nPick r (rock) p (paper) s (scissors) x (exit)");

        user = scan.nextLine().charAt(0);

    }

    public int getRandomNumber () {
        return (int)(Math.random() * 3);
    }
}
