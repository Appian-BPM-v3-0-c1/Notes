package week1.wed.demo.src;

import java.util.Scanner;

public class Problems {
    public class Easy {
        int a;
        int b;
        Scanner s1 = new Scanner(System.in);
        int getSum() {
            System.out.println("Enter the first number: ");
            a = s1.nextInt();
            System.out.println("Enter the second number: ");
            b = s1.nextInt();
            System.out.println("The sum of the two numbers is: ");
            return a + b;
        }
    }
}