package week1.wed.demo.src;
import java.util.Scanner;

public class Easy {
    static int a;
    static int b;
    static int sum;
    static Scanner s1 = new Scanner(System.in);
    public static void getSum() {
        System.out.println("Enter the first number: ");
        a = s1.nextInt();
        System.out.println("Enter the second number: ");
        b = s1.nextInt();
        sum = a + b;
        System.out.println("The sum of the two numbers is: ");
        System.out.println(sum);
    }
}
