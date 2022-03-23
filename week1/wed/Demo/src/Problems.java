import java.util.Scanner;

public class Problems {
    Scanner scan = new Scanner(System.in);

    public int easy() {
        System.out.println("Please enter the first number:\n");
        int a = scan.nextInt();
        System.out.println("Please enter the second number:\n");
        int b = scan.nextInt();
        return a + b;
    }

    public String moderate() {
        System.out.println("Please enter a number:\n");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public String finalBoss() {
        System.out.println("Please type a word:\n");
        String word = scan.nextLine();
        if (word.length() > 10) {
            System.out.println(word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
        } else {
            return word;
        }

    return "";}
}

