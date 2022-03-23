import java.util.Scanner;
public class RPS {

    public void startGame(){
        int draw = 0;
        int playerWin = 0;
        int cpuWin = 0;
        int cpu = getRandomNumber();
        char user = ' ';
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to RPS!");
        System.out.println("\nPick r (rock) p (paper) s (scissors) x (exit)");



        while (true) {
            System.out.println("Welcome to RPS!");
            System.out.println("\nPick r (rock) p (paper) s (scissors) x (exit)");
            user = scan.nextLine().charAt(0);

            //rock
            if (user == 'r' && cpu == 0) {
                System.out.println("Draw, both picked rock");
                draw++;
            } else if (user == 'r' && cpu == 1) {
                System.out.println("CPU Wins with Paper");
                cpuWin++;
            } else if (user == 'r' && cpu == 2) {
                System.out.println("Player Wins with Rock");
                playerWin++;
            }

            //paper
            if (user == 'p' && cpu == 0) {
                System.out.println("Player Win with Paper");
                playerWin++;
            } else if (user == 'p' && cpu == 1) {
                System.out.println("Draw, both picked rock");
                draw++;
            } else if (user == 'p' && cpu == 2) {
                System.out.println("CPU Win with Scissors");
                cpuWin++;
            }

            //scissors
            if (user == 's' && cpu == 0) {
                System.out.println("CPU Win with Rock");
                cpuWin++;
            } else if (user == 's' && cpu == 1) {
                System.out.println("Player Wins with Scissors");
                playerWin++;
            } else if (user == 's' && cpu == 2) {
                System.out.println("Draw, both picked scissors");
                draw++;
            }
            if (user == 'x' ){
                System.out.println("Draws: " + draw + "\nPlayer wins: " + playerWin + "\nCPU Wins: " + cpuWin);
                break;
            }
        }




    }
    public int getRandomNumber(){
        return (int)(Math.random() *3);
    }
}
