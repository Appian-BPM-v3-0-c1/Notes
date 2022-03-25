import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public void startGame() {
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

            guess = scan.nextLine().charAt(0);

            if (isGuess(guess, word)) {
                hidden = updateHidden(guess, word, hidden);
            } else {
                life = life - 1;
                System.out.println("\nINCORRECT!");
            }
        }
    }

    /**
     * <strong>Purpose</strong>: display welcome screen with life, word to guess, take a guess, etc.
     */
    private void display(char[] bank, int life, String hidden) {
    }

    /**
     * <strong>Purpose</strong>: display hangman, and the hangman as life decreases.
     */
    private void displayHangman(int life) {
    }

    /**
     * <strong>Purpose</strong>> get random word in a String word
     */
    private String getRandomWord() {
        String[] words = {"appian", "java", "python", "html", "css", "angular", "react", "javascript", "csharp", "matlab"};
        Random rand = new Random();
        int randNumber = rand.nextInt(10);

        return words[randNumber];
    }

    /**
     * Purpose: hide the word that the player is trying to guess
     */

    private String hideWord(String word) {
        StringBuilder hidden = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            hidden.append("*");
        }

        return hidden.toString();
    }

    /**
     * Purpose: see if the player guess is correct or not. Return true if correct, return false if incorrect.
     */
    private boolean isGuess(char guess, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    private String updateHidden(char guess, String word, String hidden) {
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
