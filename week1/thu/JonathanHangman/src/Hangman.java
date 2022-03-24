import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public void startGame() {
        int life = 6;
        char guess = ' ';
        String word = getRandomWord();
        String hidden = hideWord(word);
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Hangman!");
        char[] charsUsed = new char[26];
        for (int i = 0; i < 26; i++) {
            charsUsed[i] = ' ';
        }

        while (life > 0) {
            if (isWin(word,hidden)) {
                System.out.println("\nYOU WIN!");
                break;
            } else {
                displayHangman(life);
                display(charsUsed, life, hidden);
                guess = scan.nextLine().charAt(0);

                if (duplicateGuess(charsUsed,guess)) {
                    System.out.println("\nCharacter already used. Try a different character.");
                } else {
                    charsUsed = addToBank(charsUsed, guess);
                    if (isGuess(guess, word) == true) {
                        hidden = updateHidden(guess, word, hidden);
                    } else {
                        life = life - 1;
                        System.out.println("\nINCORRECT!");
                        if (life == 0) {
                            displayHangman(life);
                            System.out.println("\nYOU LOSE!");
                        }
                    }
                }
            }
        }
        System.out.println("\nGAME OVER!");
    }

    private void display(char[] bank, int life, String hidden) {
        String lineOfUsed = "";
        for (int i = 0; i < 26; i++) {
            lineOfUsed += bank[i];
        }
        System.out.println("Life: " + life);
        System.out.println("Word to guess: " + hidden);
        System.out.println("Characters used: " + lineOfUsed);
        System.out.print("Take a guess: ");
    }

    private void displayHangman(int life) {
        System.out.println("____________");
        if (life == 6) {
            System.out.println("|           ");
            System.out.println("|           ");
            System.out.println("|           ");
            System.out.println("|           ");
            System.out.println("|           ");
        }
        if (life == 5) {
            System.out.println("|     |     ");
            System.out.println("|           ");
            System.out.println("|           ");
            System.out.println("|           ");
            System.out.println("|           ");
        }
        if (life == 4) {
            System.out.println("|     |     ");
            System.out.println("|    ( )    ");
            System.out.println("|           ");
            System.out.println("|           ");
            System.out.println("|           ");
        }
        if (life == 3) {
            System.out.println("|     |     ");
            System.out.println("|    ( )    ");
            System.out.println("|   __|     ");
            System.out.println("|           ");
            System.out.println("|           ");
        }
        if (life == 2) {
            System.out.println("|     |     ");
            System.out.println("|    ( )    ");
            System.out.println("|   __|__   ");
            System.out.println("|           ");
            System.out.println("|           ");
        }
        if (life == 1) {
            System.out.println("|     |     ");
            System.out.println("|    ( )    ");
            System.out.println("|   __|__   ");
            System.out.println("|     |     ");
            System.out.println("|    /      ");
        }
        if (life == 0) {
            System.out.println("|     |     ");
            System.out.println("|    ( )    ");
            System.out.println("|   __|__   ");
            System.out.println("|     |     ");
            System.out.println("|    / \\    ");
        }
        System.out.println("------------");
    }


    private String getRandomWord(){
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
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != hidden.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private char[] addToBank(char[] bank, char guess) {
        for (int i = 0; i < 26; i++) {
            if (bank[i] == ' ') {
                bank[i] = guess;
                return bank;
            }
        }
        return bank;
    }


    private boolean duplicateGuess(char[] bank, char guess) {
        for (int i = 0; i < 26; i++) {
            if (bank[i] == guess) {
                return true;
            }
        }
        return false;
        //throw new RuntimeException();
    }

}
