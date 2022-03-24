import java.util.Scanner;

public class RPS {
    public void startGame() {
        int cpu = getRandomNumber();
        char user = 'p';


        int user_score = 0;
        int cpu_score = 0;
        int draw = 0;

        System.out.println("Welcome to RPS");

  //  while (true)
  //  {
         System.out.println("\nPick r (rock) p (paper) s (scissor) x (exit)");
         Scanner scan = new Scanner(System.in);
         if (user == 'r' && cpu == 0) {
             System.out.println("DRAW!");
         } else if (user == 'r' && cpu == 1) {
             System.out.println("CPU WIN!");
         } else if (user == 'r' && cpu == 2) {
             System.out.println("PLAYER WIN!");
         } else if(user == 'x') {
             System.exit(0);
         }

     }



    public int getRandomNumber() {
        return (int) (Math.random() * 3);
    }
}
