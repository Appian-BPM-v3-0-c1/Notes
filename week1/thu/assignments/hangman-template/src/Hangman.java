import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void startGame() {
        int life = 6;
        char guess = ' ';
        String word = getRandomWord();
        String hidden = hideWord(word);
        Scanner scan = new Scanner(System.in);

        while (life > 0) {
            System.out.println("\nWelcome to Hangman!");
            System.out.println("\nLife: " + life);
            System.out.println("Word to guess: " + hidden);
            System.out.print("Take a guess: ");
            System.out.println("\nResult:");

            guess = scan.nextLine().charAt(0);

            if (isGuess(guess, word) == true) {
                hidden = updateHidden(guess, word, hidden);
            } else {
                life = life - 1;
                System.out.println("\nINCORRECT!");
            }
        }
    }

    private void display(char[] bank, int life, String hidden) {
        if (life <= 5) {
            System.out.println('0');
        }
        if (life <= 4) {
            System.out.println('1');
        }
        if (life <= 3) {
            System.out.println('2');
        }
        if (life <= 2) {
            System.out.println('3');
        }
        if (life <= 1) {
            System.out.println('2');
        }

    }

    private void displayHangman(int life) {
        if (life <= 5) {
            System.out.println('0');
        }
        if (life <= 4) {
            System.out.println('1');
        }
        if (life <= 3) {
            System.out.println('2');
        }
        if (life <= 2) {
            System.out.println('3');
        }
        if (life <= 1) {
            System.out.println('4');
        }
        
    }

    private static String getRandomWord() {
        String[] words = {"appian", "java", "python", "html", "css", "angular", "react", "javascript", "csharp", "matlab"};
        Random rand = new Random();
        int randNumber = rand.nextInt(10);

        return words[randNumber];
    }

    private static String hideWord(String word) {
        String hidden = "";

        for (int i = 0; i < word.length(); i++) {
            hidden = hidden + "*";
        }

        return hidden;
    }

    private static boolean isGuess(char guess, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    private static String updateHidden(char guess, String word, String hidden) {
        StringBuilder sb = new StringBuilder(hidden);

        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                sb.replace(i, i + 1, String.valueOf(guess));
            }
        }

        hidden = sb.toString();

        return hidden;
    }

    private boolean isWin(String word, String hidden) {
        throw new RuntimeException();
    }

    private void addToBank(char[] bank, char guess) {
    }

    private boolean duplicateGuess(char[] bank, char guess) {
        throw new RuntimeException();
    }
}
