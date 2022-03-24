import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner p3Type = new Scanner(System.in);
        System.out.println("Enter a word...");


        String enteredWord = p3Type.nextLine();
        if(enteredWord.length() > 10){
            System.out.println(enteredWord.charAt(0) + String.valueOf(enteredWord.length() - 2) + (enteredWord.length() - 1));
        }
        else
            System.out.println("word");
    }
}
