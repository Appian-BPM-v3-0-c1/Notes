import java.util.Scanner;

public class HangmanTest {

    private static String[] bank = {"orbit", "poster", "category", "isolate", "catalyst", "symptom", "analog", "perpetuate"};
    private static String word = bank[(int) (Math.random() * bank.length)];
    private static String letter = new String(new char[word.length()]).replace("\0","*");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 6 && letter.contains("*")) {
            System.out.println("Guess a letter.");
            System.out.println(letter);
            String guess = sc.next();
            hang(guess);

        }
        sc.close();
    }

    public static void hang(String guess) {
        String newLetter = "";
        for (int i = 0; i < word.length(); i ++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newLetter += guess.charAt(0);
            } else if (letter.charAt(i) != '*') {
                newLetter += word.charAt(i);
            } else {
                newLetter += "*";
            }
        }

        if (letter.equals(newLetter)) {
            count++;
            gallows();
        } else {
            letter = newLetter;
        }
        if(letter.equals(word)) {
            System.out.println("You win.");
            System.out.println("The word was: " + word);
        }


    }

    public static void gallows() {
        if (count == 1) {
            System.out.println("Wrong. Try again.");
            System.out.println(" ________");
            System.out.println("|   /    |");
            System.out.println("|  /   (   )");
            System.out.println("| /");
            System.out.println("|/");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("_________");
            System.out.println("|       |");
        }

        if (count == 2) {
            System.out.println("Wrong. Try again.");
            System.out.println(" ________");
            System.out.println("|   /    |");
            System.out.println("|  /   (   )");
            System.out.println("| /      |");
            System.out.println("|/       |");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("_________");
            System.out.println("|       |");
        }

        if (count == 3) {
            System.out.println("Wrong. Try again.");
            System.out.println(" ________");
            System.out.println("|   /    |");
            System.out.println("|  /   (   )");
            System.out.println("| /      |");
            System.out.println("|/       |");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|       /");
            System.out.println("|      /");
            System.out.println("_________");
            System.out.println("|       |");
        }

        if (count == 4) {
            System.out.println("Wrong. Try again.");
            System.out.println(" ________");
            System.out.println("|   /    |");
            System.out.println("|  /   (   )");
            System.out.println("| /      |");
            System.out.println("|/       |");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|       / \\");
            System.out.println("|      /   \\");
            System.out.println("_________");
            System.out.println("|       |");
        }

        if (count == 5) {
            System.out.println("Wrong. Try again.");
            System.out.println(" ________");
            System.out.println("|   /    |");
            System.out.println("|  /   (   )");
            System.out.println("| /     /|");
            System.out.println("|/     / |");
            System.out.println("|     /  |");
            System.out.println("|        |");
            System.out.println("|       / \\");
            System.out.println("|      /   \\");
            System.out.println("_________");
            System.out.println("|       |");
        }

        if (count == 6) {
            System.out.println("Wrong. Try again.");
            System.out.println(" ________");
            System.out.println("|   /    |");
            System.out.println("|  /   (   )");
            System.out.println("| /     /|\\");
            System.out.println("|/     / | \\");
            System.out.println("|     /  |  \\");
            System.out.println("|        |");
            System.out.println("|       /\\");
            System.out.println("|      /  \\");
            System.out.println("_________");
            System.out.println("|       |");
        }
    }

}
