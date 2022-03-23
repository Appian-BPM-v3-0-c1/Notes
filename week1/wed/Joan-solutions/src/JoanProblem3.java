import java.util.Scanner;

public class JoanProblem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        String abbr;

        System.out.println("Enter the word to be (potentially) abbreviated: ");
        word = input.next();

        char first = word.charAt(0);
        char last = word.charAt(word.length() -1);
        int wlen = word.length();
        String wlenstr = String.valueOf(wlen - 2);

        abbr = first+wlenstr+last;

        if (wlen > 10) {
            System.out.println("The abbreviated word is: "+abbr);
        } else {
            System.out.println("There is no need to abbreviate this word: "+word);
        }
    }
}