import java.util.Scanner;

public class JoanProblem2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int c = 1;
        int d;

        System.out.println("Enter your number: ");
        c = input.nextInt();

        d = c % 2;

        if (d == 0) {
            System.out.println("YES, the number is even.");
        } else {
            System.out.println("NO, the number is odd.");
        }
    }
}
