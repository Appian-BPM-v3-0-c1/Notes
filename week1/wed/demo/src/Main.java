package week1.wed.demo.src;
import java.util.Scanner;

public class Main {
    static Easy e = new Easy();
    static Scanner s1 = new Scanner(System.in);
    static int a;
    static int b;
    static int sum;
    int n = 100;
    char c = 's';
    String s = "appian";
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("My name is Jonathan Oyama.");
        System.out.println("Enter the first number: ");
        a = s1.nextInt();
        System.out.println("Enter the second number: ");
        b = s1.nextInt();
        sum = e.getSum(a,b);
        System.out.println("The sum of the two numbers is: ");
        System.out.println(sum);
    }
}
