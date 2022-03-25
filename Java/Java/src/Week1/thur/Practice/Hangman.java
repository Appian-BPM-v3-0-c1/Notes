package Week1.thur.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	 public void startGame() {
	        int life = 6;
	        char guess = ' ';
	        char[] bank = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	        String word = getWord();
	        String hidden = hideWord(word);
	        Scanner scan = new Scanner(System.in);

	        System.out.println("Welcome to Hangman!");

	        while (life > 0) {
	            display(bank, life, hidden);

	            try {
	                guess = scan.nextLine().charAt(0);

	                if (isGuess(guess, word)) {
	                    hidden = updateHidden(guess, word, hidden);

	                    if (!dupGuess(bank, guess)) {
	                        System.out.println("\nCORRECT!");
	                        addToBank(bank, guess);

	                    } else {
	                        System.out.println("\nYOU'VE ALREADY MADE THIS GUESS!");
	                    }

	                } else {
	                    if (!dupGuess(bank, guess)) {
	                        life--;
	                        System.out.println("\nINCORRECT!");

	                        addToBank(bank, guess);
	                    } else {
	                        System.out.println("\nYOU'VE ALREADY MADE THIS GUESS!");
	                    }
	                }
	            } catch (StringIndexOutOfBoundsException e) {
	                System.out.println("Invalid input");
	            }

	            if (isWin(word, hidden)) {
	                System.out.println("YAY, YOU'VE WON!");
	                break;
	            }
	        }

	        if (!isWin(word, hidden)) {
	            displayHangman(life);
	            System.out.println("\nYOU LOSE!");
	            System.out.println("The word was: " + word);
	        }
	    }

	    public void display(char[] bank, int life, String hidden) {
	        displayHangman(life);
	        System.out.print("\nLife: " + life);
	        System.out.print("\nWord to guess: " + hidden);
	        System.out.print("\nGuess bank: ");

	        for (int i = 0; i < bank.length; i++) {
	            if (bank[i] == ' ') {
	                break;
	            } else {
	                System.out.print(bank[i] + " ");
	            }
	        }

	        System.out.print("\nTake a guess: ");
	    }

	    public void displayHangman(int life) {
	        switch (life) {
	            case 6:
	            	System.out.println("Wrong guess, try again");
	    			System.out.println();
	    			System.out.println();
	    			System.out.println();
	    			System.out.println();
	    			System.out.println("___|___");
	    			System.out.println();

	                break;
	            case 5:
	            	System.out.println("Wrong guess, try again");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("___|___");
	                break;
	            case 4:
	            	System.out.println("Wrong guess, try again");
	    			System.out.println("   ____________");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   | ");
	    			System.out.println("___|___");
	                break;
	            case 3:
	            	System.out.println("Wrong guess, try again");
	    			System.out.println("   ____________");
	    			System.out.println("   |          _|_");
	    			System.out.println("   |         /   \\");
	    			System.out.println("   |        |     |");
	    			System.out.println("   |         \\_ _/");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("   |");
	    			System.out.println("___|___");
	                break;
	            case 2:
	            	System.out.println("Wrong guess, try again");
	    			System.out.println("   ____________");
	    			System.out.println("   |          _|_");
	    			System.out.println("   |         /   \\");
	    			System.out.println("   |        |     |");
	    			System.out.println("   |         \\_ _/");
	    			System.out.println("   |           |");
	    			System.out.println("   |           |");
	    			System.out.println("   |");
	    			System.out.println("___|___");
	                break;
	            case 1:
	            	System.out.println("Wrong guess, try again");
	    			System.out.println("   ____________");
	    			System.out.println("   |          _|_");
	    			System.out.println("   |         /   \\");
	    			System.out.println("   |        |     |");
	    			System.out.println("   |         \\_ _/");
	    			System.out.println("   |           |");
	    			System.out.println("   |           |");
	    			System.out.println("   |          / \\ ");
	    			System.out.println("___|___      /   \\");
	                break;
	            case 0:
	            	System.out.println("GAME OVER!");
	    			System.out.println("   ____________");
	    			System.out.println("   |          _|_");
	    			System.out.println("   |         /   \\");
	    			System.out.println("   |        |     |");
	    			System.out.println("   |         \\_ _/");
	    			System.out.println("   |          _|_");
	    			System.out.println("   |         / | \\");
	    			System.out.println("   |          / \\ ");
	    			System.out.println("___|___      /   \\");
	                break;
	            default:
	                break;
	        }
	    }

	    public String getWord() {
	        Random rand = new Random();
	        String[] word = {"appian", "java", "angular"};
	        return word[rand.nextInt(3)];
	    }

	    public String hideWord(String word) {
	        String hidden = "";

	        for (int i = 0; i < word.length(); i++) {
	            hidden += "*";
	        }

	        return hidden;
	    }

	    public boolean isGuess(char guess, String word) {
	        for (char c : word.toCharArray()) {
	            if (c == guess) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public String updateHidden(char guess, String word, String hidden) {
	        StringBuilder sb = new StringBuilder(hidden);

	        for (int i = 0; i < word.length(); i++) {
	            if (guess == word.charAt(i)) {
	                sb.replace(i, i + 1, String.valueOf(guess));
	            }
	        }

	        return sb.toString();
	    }

	    public boolean isWin(String word, String hidden) {
	        if (hidden.equals(word)) {
	            return true;
	        }

	        return false;
	    }

	    public void addToBank(char[] bank, char guess) {
	        for (int i = 0; i < bank.length; i++) {
	            if (bank[i] == ' ') {
	                bank[i] = guess;
	                break;
	            }
	        }
	    }

	    public boolean dupGuess(char[] bank, char guess) {
	        for (int i = 0; i < bank.length; i++) {
	            if (bank[i] == guess) {
	                return true;
	            }
	        }

	        return false;
	    }
}
