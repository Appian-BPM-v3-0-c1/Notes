import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Problems problems = new Problems();

        Scanner scan = new Scanner(System.in);
        System.out.println("pick a number: ");
        int a = scan.nextInt();

        System.out.println("Pick another number: ");
        int b = scan.nextInt();
        System.out.println("Your total is: " + a + b);


        System.out.println(problems.moderate(5));


        System.out.println(problems.hard("localization"));
    }
}
