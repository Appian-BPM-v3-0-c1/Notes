import java.util.Scanner;

public class RPS {
    public void startGame() {
        int draw = 0;
        int playerWin = 0;
        int cpuWin = 0;
        int cpu = getRandomNumber();
        char user = ' ';


        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to RPS!");
            System.out.println("\nPick r (Rock) p (Paper) s (Scissor) x (exit)");

            user = scan.nextLine().charAt(0);

            if (user == 'r' && cpu == 0) {
                System.out.println("Draw, both picked rock.");
                draw++;
            } else if (user == 'r' && cpu == 1) {
                System.out.println("CPU wins with paper.");
                cpuWin++;

            } else if (user == 'r' && cpu == 2) {
                System.out.println("Player wins with rock.");
                playerWin++;
            }


            if (user == 'p' && cpu == 0) {
                System.out.println("Player win with paper.");
                playerWin++;
            } else if (user == 'p' && cpu == 1) {
                System.out.println("Draw, both picked rock.");
                draw++;

            } else if (user == 'p' && cpu == 2) {
                System.out.println("CPU win with Scissors.");
                cpuWin++;
            }

            if (user == 's' && cpu == 0) {
                System.out.println("CPU win with Rock.");
                cpuWin++;
            } else if (user == 's' && cpu == 1) {
                System.out.println("Player win with Scissors.");
                playerWin++;

            } else if (user == 's' && cpu == 2) {
                System.out.println("Draw, both picked scissors.");
                draw++;
            }

            if (user == 'x') {
                System.out.println("Draw: " + draw + "\nPlayer wins: " + playerWin + "\nCPU wins: " + cpuWin);
            }
        }
    }

    public int getRandomNumber(){
        return (int)(Math.random() * 3);
    }
}
