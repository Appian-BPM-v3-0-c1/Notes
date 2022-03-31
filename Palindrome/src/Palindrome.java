import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        //Declared extra int variables to check if palindrome
        int num;
        int t;
        int s;
        int rem = 0;
        //create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        //take input from user
        num = sc.nextInt();
        //reassign num variable to t
        t = num;
        //for loop starts at beginning character of s, and will loop as long as num varible is
        // greater than 0 characters from left to right
        for(s=0; num > 0; num/=10) {
            //checks t/s from the right to left
            rem= num % 10;
            s=(s*10)+rem;

        } if( s == t) {
            //if s is equal to t print line 23
            System.out.println(t + " is a palindrome Number");
        } else {
            //if s is NOT equal to t print line 26
            System.out.println(t + " is not a palindrome Number");
        }
    }
}