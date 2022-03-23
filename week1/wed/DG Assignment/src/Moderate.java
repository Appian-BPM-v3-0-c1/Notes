import java.util.Scanner;

public class Moderate {

    public void moderate() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input an integer: ");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println(input + " is even.");
        } else {
            System.out.println(input + " is odd.");
        }



    }
}
