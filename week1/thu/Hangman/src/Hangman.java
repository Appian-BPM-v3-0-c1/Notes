import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public void startGame() {
        int life = 6;
        char guess = ' ';
        String word = getRandomWord();
        String hidden = hideWord(word);
        Scanner scan = new Scanner(System.in);
        char[] bank = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        System.out.println("Welcome to Hangman!");
        System.out.println(" ________");
        System.out.println("|   /    |");
        System.out.println("|  / ");
        System.out.println("| /");
        System.out.println("|/");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("_________");
        System.out.println("|       |");

        while (life > 0) {

            System.out.println("\nLife: " + life);
            System.out.println("Word to guess: " + hidden);
            System.out.print("Take a guess: ");

            guess = scan.nextLine().charAt(0);

            addToBank(bank, guess);
            for (int i = 0; i < bank.length; i++) {
                System.out.print(bank[i] + ", ");
            }

            if (duplicateGuess(bank, guess) == true) {
                System.out.println("\nDuplicate guess.");
            }

            if (isGuess(guess, word) == true) {
                hidden = updateHidden(guess, word, hidden);
            } else {
                life = life - 1;
                System.out.println("\nINCORRECT!");
                
            }

            if (isWin(word, hidden) == true) {
                System.out.println("Congratulations. You win.");
                System.out.println("The word was " + word);
                break;
            }

        }



        scan.close();
    }


    private void display(char[] bank, int life, String hidden) {
        displayHangman(life);
        System.out.println("\nLife: " + life);
        System.out.println("\nWord to guess: " + hidden);
        System.out.println("\nGuess bank: ");

        for (int i = 0; i <bank.length; i++) {
            if (bank[i] == ' ') {
                break;
            } else {
                System.out.println(bank[i] + " ");
            }
        }

        System.out.println("Guess a letter...");
    }

    private void displayHangman(int life) {

        if (life == 5) {

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

        } else if (life == 4) {
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

        } else if (life == 3) {
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
    }

    private String getRandomWord() {
        String[] words = {"appian", "java", "python", "html", "css", "angular", "react", "javascript", "csharp", "matlab"};
        Random rand = new Random();
        int randNumber = rand.nextInt(10);

        return words[randNumber];
    }

    private String hideWord(String word) {
        String hidden = "";

        for (int i = 0; i < word.length(); i++) {
            hidden = hidden + "*";
        }

        return hidden;
    }

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

        if (hidden.equals(word)) {
            return true;

        } else {
            return false;

        }

    }

    private void addToBank(char[] bank, char guess) {
        for (int i = 0; i < bank.length; i++) {
            if (bank[i] == ' ') {
                bank[i] = guess;
                break;
            }

        }

    }

    private boolean duplicateGuess(char[] bank, char guess) {
        for (int i = 0; i < bank.length; i++) {
            if (guess == bank[i]) {
                return true;
            }

        }

        return false;
    }
}