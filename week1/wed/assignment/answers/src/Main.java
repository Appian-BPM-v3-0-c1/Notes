import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner allType = new Scanner(System.in);

        allAnswersMethods problems = new allAnswersMethods();
        System.out.println("Type a variable");
        int p1a = allType.nextInt();

        System.out.println("Type in another variable");
        int p1b = allType.nextInt();

        System.out.println(problems.easy(p1a, p1b));

        System.out.println("Type in a variable");
        int p2c = allType.nextInt();
        System.out.println(problems.moderate(p2c));


        System.out.println("Type a word...");
        String word = allType.nextLine();

        System.out.println(problems.hard(word));
    }
}
