import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public void startGame() {
        int life = 6;
        int i = 0;
        int a = 0;
        char guess = ' ';
        char bank = ' ';
        char uBank[] = new char[26];
        String word = getRandomWord();
        String hidden = hideWord(word);
        Scanner scan = new Scanner(System.in);


        // the hangman game
        System.out.println(" |-------|");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("|-|-|-|-|");
        while (life > 0) {
            System.out.println("\nWelcome to Hangman!");
            System.out.println("\nLife: " + life);
            System.out.println("Word to guess: " + hidden);
            System.out.print("Take a guess: ");

            guess = scan.nextLine().charAt(0);
            bank = guess;
            uBank[a] = bank;
            a++;

            if (isGuess(guess, word) == true) {
                hidden = updateHidden(guess, word, hidden);
            } else {
                life = life - 1;
                System.out.println("\nINCORRECT!");
            }
            displayHangman(life);

            addToBank(uBank, guess, i);

            display(bank, life, hidden);
        }
    }

    private void display(char bank, int life, String hidden) {
        System.out.print("\n------------------------");
        System.out.println(bank);
    }

    private void displayHangman(int life) {
        if(life == 6){
            System.out.println(" |-------|");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("|-|-|-|-|");
        }
        if(life == 5){
            System.out.println(" |-------|");
            System.out.println(" |       O");
            System.out.println(" | ");
            System.out.println(" | ");
            System.out.println(" |");
            System.out.println("|-|-|-|-|");
        }else if(life == 4){
            System.out.println(" |-------|");
            System.out.println(" |       O");
            System.out.println(" |       |");
            System.out.println(" |      ");
            System.out.println(" |");
            System.out.println("|-|-|-|-|");
        }else if(life == 3){
            System.out.println(" |-------|");
            System.out.println(" |       O");
            System.out.println(" |       |>-");
            System.out.println(" |      ");
            System.out.println(" |");
            System.out.println("|-|-|-|-|");
        }else if(life == 2){
            System.out.println(" |-------|");
            System.out.println(" |       O");
            System.out.println(" |     -<|>-");
            System.out.println(" |      ");
            System.out.println(" |");
            System.out.println("|-|-|-|-|");
        }else if(life == 1){
            System.out.println(" |-------|");
            System.out.println(" |       O");
            System.out.println(" |     -<|>-");
            System.out.println(" |      /");
            System.out.println(" |");
            System.out.println("|-|-|-|-|");
        }
        else if(life == 0){
            System.out.println(" |-------|");
            System.out.println(" |       O");
            System.out.println(" |     -<|>-");
            System.out.println(" |      //");
            System.out.println(" |");
            System.out.println("|-|-|-|-|");
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
        throw new RuntimeException();
    }

    private void addToBank(char[] bank, char guess, int i) {
        bank[i] = guess;
        i++;
    }

    private boolean duplicateGuess(char[] bank, char guess) {
        throw new RuntimeException();
    }
}
