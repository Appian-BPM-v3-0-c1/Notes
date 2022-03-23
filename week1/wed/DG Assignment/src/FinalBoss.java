import java.util.Scanner;

public class FinalBoss {

    public void finalBoss(){

        Scanner fbScanner = new Scanner(System.in);
        System.out.println("Please input a string: ");

        String input = fbScanner.nextLine();
        int inputLength = (input.length() - 2);
        char firstInput = input.charAt(0);
        char lastInput = input.charAt(input.length() - 1);

        if (input.length() < 10) {

            System.out.println(input);

        } else {

            System.out.print(firstInput);
            System.out.print(inputLength);
            System.out.print(lastInput);



        }

    }
}
