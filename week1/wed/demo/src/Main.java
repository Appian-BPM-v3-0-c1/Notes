import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String r = "rock";
        String p = "paper";
        String s = "scissors";

        String [] plays = {r, p, s};

        boolean quit = false;

        String comPlay;
        String userPlay;

        int index;

        while (!quit){
            System.out.println("my turn: (rock/paper/scissors");
            userPlay = scanner.nextLine();

            index = random.nextInt(3);
            comPlay = plays[index];

            System.out.println("User play: " + userPlay + " Computer's play"+ comPlay);



            if(userPlay.equals(comPlay)){
                System.out.println("Tie");
            }else if (userPlay.equals(r) && comPlay.equals(p)){
                System.out.println("Computer Wins!");

            }else if (userPlay.equals(r) && comPlay.equals(s)){
                System.out.println("You Win!");

            }else if (userPlay.equals(p) && comPlay.equals(r)){
                System.out.println("You Win!");

            }else if (userPlay.equals(p) && comPlay.equals(s)){
                System.out.println("Computer Wins!");

            }else if (userPlay.equals(s) && comPlay.equals(r)) {
                System.out.println("Computer Wins!");

            }else if (userPlay.equals(s) && comPlay.equals(p)){
                System.out.println("You Win!");

            }else{
                System.out.println("Invaild play");

            }

            System.out.println();
            System.out.println();
        }



    }

    }

