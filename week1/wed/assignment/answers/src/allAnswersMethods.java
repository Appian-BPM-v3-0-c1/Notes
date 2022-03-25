
public class allAnswersMethods {

    public int easy(int a, int b) {
        return a + b;
    }

    public String moderate(int c) {
        if(c % 2 == 0) {
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    public String hard(String w) {

        if (w.length() > 10) {
            return w.charAt(0) + String.valueOf(w.length() - 2) + w.charAt(w.length() - 1);
        }
        else {
            return null;
        }
    }
}
