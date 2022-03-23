import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String r = '';

        System.out.println("Enter first number: ");
        a = input.nextInt();

        System.out.println("Enter second number: ");
        b = input.nextInt();

        sum = a + b;

        System.out.println("The sum of the two numbers is: "+sum);
    }
}