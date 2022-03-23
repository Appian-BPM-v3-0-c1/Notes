import java.util.Scanner;

public class JoanSolutions {

    public String easy(int a, int b, int sum) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = input.nextInt();

        System.out.println("Enter second number: ");
        b = input.nextInt();

        sum = a + b;

        return "The sum of the two numbers is: "+sum;
    }

    public String moderate(int c, int d) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        c = input.nextInt();

        d = c % 2;

        if (d == 0) {
            return "YES, the number is even.";
        } else {
            return "NO, the number is odd.";
        }
    }

    public String finalBoss(String word, String abbr, char first, char last, int wlen, String wlenstr) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word to be (potentially) abbreviated: ");
        word = input.next();

        first = word.charAt(0);
        last = word.charAt(word.length() -1);
        wlen = word.length();
        wlenstr = String.valueOf(wlen - 2);

        abbr = first+wlenstr+last;

        if (wlen > 10) {
            return "The abbreviated word is: "+abbr;
        } else {
            return "There is no need to abbreviate this word: "+word;
        }
    }
}