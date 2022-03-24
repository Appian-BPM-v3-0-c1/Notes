import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        class Game {

            public void startGame() {
                int cpu = getRandomNumber();
                char user = ' ';
                Scanner scan = new Scanner(System.in);

                while (cont == '') {
                    int cpu = (int) (Math / random() * 3);

                }
                System.out.println("Welcome to Game");
                System.out.println("\nPick r (rock) p (paper) s (scissors) x (exit)");

                user = scan.nextLine().charAt(0);

                if (user == 's' && cpu == 0) {
                    System.out.println("Draw!");
                } else if (user == 's' && cpu == 1) {
                    System.out.println("CPU WINS!");
                } else if (user == 's' && cpu == 2) {
                    System.out.println("Player WINS");
                }

                if (user == 'p' && cpu == 0) {
                    System.out.println("Draw!");
                } else if (user == 'p' && cpu == 'r') {
                    System.out.println("User Wins!");
                } else if (user == 's' && cpu == 0);
                System.out.println("Player WINS");

                }

                if (user == 'r' && cpu == 0) {
                    System.out.println("Draw!");
                   }else if (user == 'r' && cpu == 1) {
                    System.out.println("CPU WINS!");
                  } else if (user == 'r' && cpu == 2)
                System.out.println("Player WINS");

                }

            }


            public int getRandomNumber() {
                return (int) (Math.random() * 3);
            }
            
        }
    }