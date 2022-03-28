import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
// 0=Rock, 1=papar, 2=scissor, 3=exit
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();



        while(true) {
            int cpuMove = rand.nextInt(3);
            System.out.println("PLease select 0 for rock, 1 for paper, 2 for scissor, 3 for exit");
            int userMove = scan.nextInt();


            if (cpuMove == 0 && userMove == 0) {
                System.out.println("it is a draw");
            } else if (cpuMove == 0 && userMove == 1) {
                System.out.println("You Win");
            } else if (cpuMove == 0 && userMove == 2) {
                System.out.println("You lose");
            } else if (cpuMove == 1 && userMove == 0) {
                System.out.println("you lose");
            } else if (cpuMove == 1 && userMove == 1) {
                System.out.println("it is a draw");
            } else if (cpuMove == 1 && userMove == 2) {
                System.out.println("You Win");
            } else if (cpuMove == 2 && userMove == 0) {
                System.out.println("you Win");
            } else if (cpuMove == 2 && userMove == 1) {
                System.out.println("You lose");
            } else if (cpuMove == 2 && userMove == 2) {
                System.out.println("it is a draw");
            } else if (userMove==3){
                System.exit(0);
            }
        }


    }
}