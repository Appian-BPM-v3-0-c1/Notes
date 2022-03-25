import java.util.Scanner;

public class RPS {

    public void startGame() {
        int cpu = getRandNum();
        boolean decision = true;
        char answer = ' ';
        int playerScore = 0;
        int cpuScore = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Lets play Rock, Paper, Scissors?");
            while(decision==true) {
                System.out.println("\nPick r (rock) p (paper) scissors x (exit)");
                char user = ' ';
                user = scan.nextLine().charAt(0);
                //
                //
                //Player uses Rock instance
                if (user == 'r' && cpu == 0) {
                    System.out.println("Draw!");
                } else if (user == 'r' && cpu == 1) {
                    System.out.println("CPU Wins!");
                    cpuScore = cpuScore + 1;
                } else if (user == 'r' && cpu == 2) {
                    System.out.println("Player Wins!");
                    playerScore = playerScore + 1;

                }
                //
                //
                //Player uses Scissors instance
                if (user == 's' && cpu == 0) {
                    System.out.println("CPU Wins!");
                    cpuScore = cpuScore + 1;
                } else if (user == 's' && cpu == 1) {
                    System.out.println("Player Wins!");
                    playerScore = playerScore + 1;
                } else if (user == 's' && cpu == 2) {
                    System.out.println("DRAW!");
                }
                //
                //
                //Player uses Paper instance
                if (user == 'p' && cpu == 0) {
                    System.out.println("Player Wins!");
                    playerScore = playerScore + 1;
                } else if (user == 'p' && cpu == 1) {
                    System.out.println("DRAW!");
                } else if (user == 'p' && cpu == 2) {
                    System.out.println("CPU Wins!");
                    cpuScore = cpuScore + 1;
                }



                //add score keeper
                System.out.println("The Score is...\nPlayer: " + playerScore + "\nCPU: " + cpuScore);
                System.out.println("Would you like to play again \n[y] Yes\n[n] No");
                answer = scan.next().charAt(0);
                if (answer == 'y') {
                    decision = true;
                } else if (answer == 'n') {
                    decision = false;
                        if(cpuScore > playerScore) {
                            System.out.println("HaHaHa I win");
                        }
                        else if(playerScore > cpuScore) {
                            System.out.println("Darn you won");
                        }
                        else if(playerScore == cpuScore) {
                            System.out.println("I guess we both lost...");
                        }
                    System.out.println("Thanks for playing!");

                }
            }

        }



    public int getRandNum() {
        return (int)(Math.random() * 3);
    }
}
