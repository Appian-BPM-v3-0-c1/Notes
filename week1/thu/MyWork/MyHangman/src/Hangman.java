import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public void startGame() {
        Scanner scan = new Scanner(System.in);
        int life = 6;
        char guess = ' ';
        char[] bank = new char[26];
        for (int i = 0; i < bank.length; i++) {
            bank[i] = guess;
        }
        String word = getWord();
        String hidden = hideWord(word);

        System.out.println("This is Jacob's version of Hangman!\n");

        while (life > 0) {
            display(bank, life, hidden);
            guess = scan.nextLine().charAt(0);
            if(isGuess(guess, word) == true) {
                System.out.println("The word DOES contain " + guess);
        } else {
                life -= life;
                System.out.println("The word does NOT contain " + guess);
            }
    }

        public void display(char[] bank, int life, String hidden) {
            displayHangman(life);
            System.out.println("Tries remaining: " + life);
            System.out.println("Word To Guess: " + hidden);
            System.out.print("Next Guess: ");
        }

        private boolean isGuess(char guess, String word) {
            for(int i = 0; i < word.length() ; i++) {
                if(guess == word.charAt(i)) {
                    return true;
                }
            } return false;

        }

    }
    public String hideWord(String word) {
        String hidden = "";

        for (int i = 0; i < word.length(); i++) {
            hidden += "_";
        }
        return hidden;
    }
    public String getWord() {
        Random random = new Random();
        String[] word = {"Bulbasaur", "charmander", "squirtle", "pikachu",
                "chikorita", "cyndaquil", "totodile", "treecko", "torchic",
                "mudkip", "turtwig", "chimchar", "piplup", "snivy", "tepig",
                "oshawott", "chespin", "fennekin", "froakie", "rowlet",
                "litten", "popplio", "grookey", "scorbunny", "sobble"};
        return word[random.nextInt(25)];
    }
    public boolean isGuess(char guess, String word) {
        for (char c : word.toCharArray()) {
            if (c == guess) {
                return true;
            }
        }
        return false;
    }
}
