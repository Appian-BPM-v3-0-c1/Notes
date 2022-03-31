import java.util.Scanner;
public class Main {
    public static <string> void main(String[] args) {
        Problems problems = new Problems();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("The sum of these 2 numbers is: " + problems.easy(a,b));

        System.out.println("\nEnter a number to determine whether it is even or odd: ");
        a = input.nextInt();
        System.out.println(problems.moderate(a));

        System.out.println("\nEnter a word: ");
        String s = input.next();
        System.out.println(problems.hard(s));






    }
}
