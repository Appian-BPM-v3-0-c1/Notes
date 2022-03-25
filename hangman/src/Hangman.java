import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public void startGame() {
        int life = 6;
        char guess = ' ';
        //declaring empty character array for used letters
        char[] bank = {' ', ' ', ' ', ' ', ' ',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
                ' ', ' ', ' ', ' ', ' ', ' '};
        String word = getRandomWord();
        String hidden = hideWord(word);
        Scanner scan = new Scanner((System.in));


        while(life > 0) {
            display(bank, life, hidden);

            try{
                guess=scan.nextLine().charAt(0);

                if(isGuess(guess, word)) {
                    hidden = updateHidden(guess, word, hidden);

                    if(!duplicateGuess(bank, guess)) {
                        System.out.println("\nCorrect!");
                        addToBank(bank, guess);

                    } else {
                        System.out.println("\nYou've Already Chosen that Letter");

                    }

                } else {
                    if (!duplicateGuess(bank, guess)) {
                        life--;
                        System.out.println("\nIncorrect!");

                        addToBank(bank, guess);
                    } else {
                        System.out.println("\nYou've Already Made This Guess");
                    }
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Invalid Input");
            }

            if (isWin(word, hidden)) {
                System.out.println("You've Won!!");
                break;
            }

        }

        if (!isWin(word, hidden)) {
            displayHangman(life);
            System.out.println("\nYou Lose");
            System.out.println("THe word was: " + word);
        }
    }

    private void display(char[] bank, int life, String hidden) {
        displayHangman(life);
        System.out.println("\nLife: " + life);
        System.out.print("\nWord to guess: " +hidden);
        System.out.print("\nTake a guess: ");

        //loop through bank[]
        for(int i = 0; i < bank.length; i++) {
            if(bank[i] == ' ') {
                break;
            } else {
                System.out.println(bank[i] + " ");
            }
        }

        System.out.println("\nTake a Guess");
    }

    private void displayHangman(int life) {
        switch (life) {
            case 6:
                System.out.println("------");
                System.out.println("|    |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");

                break;
            case 5:
                System.out.println("------");
                System.out.println("|    |");
                System.out.println("|    o");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 4:
                System.out.println("------");
                System.out.println("|    |");
                System.out.println("|    o");
                System.out.println("|    |");
                System.out.println("|");
                System.out.println("|");
                break;
            case 3:
                System.out.println("------");
                System.out.println("|    |");
                System.out.println("|    o");
                System.out.println("|   /|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 2:
                System.out.println("\n------");
                System.out.println("|    |");
                System.out.println("|    o");
                System.out.println("|   /|\\");
                System.out.println("|");
                System.out.println("|");
                break;
            case 1:
                System.out.println("------");
                System.out.println("|    |");
                System.out.println("|    o");
                System.out.println("|   /|\\");
                System.out.println("|   /");
                System.out.println("|");
                break;
            case 0:
                System.out.println("------");
                System.out.println("|    |");
                System.out.println("|    o");
                System.out.println("|   /|\\");
                System.out.println("|   / \\");
                System.out.println("|");
                break;
            default:
                break;
        }
    }

    private String getRandomWord() {
        String[] words = {"programming", "javascript", "appian", "angular", "andriod", "flutter", "react"};

        Random rand = new Random();
        int randNumber = rand.nextInt(7);

        return words[randNumber];
    }
    //Hide the word from the user
    private String hideWord(String word) {
        String hidden = " ";
        //for loop adds ** in place of the characters of the word
        for(int i = 0; i < word.length();i++) {
            hidden = hidden + '*';
        }

        return hidden;
    }

    private boolean isGuess(char guess, String word) {
        for(int i = 0; i < word.length(); i++) {
            if(guess == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    private String updateHidden(char guess, String word, String hidden) {
        StringBuilder sb = new StringBuilder(hidden);


        for(int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                sb.replace(i, i + 1, String.valueOf(guess));
            }
        }
        //convert object to a string
        hidden = sb.toString();

        return hidden;
    }

    private boolean isWin(String word, String hidden) {
        if(hidden.equals(word)) {
            return true;
        }

        return false;
    }

    private void addToBank(char[] bank, char guess){
        for (int i = 0; i < bank.length; i++) {
            if(bank[i] == ' ') {
                bank[i] = guess;
                break;
            }

        }

    }

    private boolean duplicateGuess(char[] bank, char guess) {
        //check for duplicate guess in bank array
       for(int i = 0; i < bank.length; i++){
           if(bank[i]  == guess) {
               return true;
           }
       }
       return false;
    }
}
