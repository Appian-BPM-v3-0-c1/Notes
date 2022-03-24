
public class Hangman {
    public void startGame() {
    }

    public void display(char[] bank, int life, String hidden) {
    }

    public void displayHangman(int life) {
    }

    public String getWord() {
        throw new RuntimeException();
    }

    public String hideWord(String word) {
        throw new RuntimeException();
    }

    public boolean isGuess(char guess, String word) {
        throw new RuntimeException();
    }

    public String updateHidden(char guess, String word, String hidden) {
        throw new RuntimeException();
    }

    public boolean isWin(String word, String hidden) {
        throw new RuntimeException();
    }

    public void addToBank(char[] bank, char guess) {}

    public boolean dupGuess(char[] bank, char guess) {
        throw new RuntimeException();
    }
}
