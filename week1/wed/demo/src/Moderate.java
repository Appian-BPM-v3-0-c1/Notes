package week1.wed.demo.src;
import java.util.Scanner;

public class Moderate {
    static int num1;
    static int num2 = 2;
    static int remainder;
    static Scanner s1 = new Scanner(System.in);
    public static void getModulus() {
        System.out.println("Is it even?");
        System.out.println("Enter the number being tested: ");
        num1 = s1.nextInt();
        remainder = num1 % num2;
        System.out.println("The result after  two numbers is: ");
        System.out.println(remainder);
        if (remainder == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
