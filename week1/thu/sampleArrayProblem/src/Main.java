import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int[] arr = new int[12];

        /* create an arr of Strings with the size 12 */
        /* Get the user input (jan - dec) */
        /* Store the user input into the string array */
        /* Printout array with the user input */
        String[] arr = new String[12];
        String user = "";
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Type in a word: ");
            user = scan.next();
            arr[i] = user;
        }
        //  for (int i = 0; i < arr.length; i++) {
        //      System.out.println(arr[i]);
        //  }
        System.out.println("Odd months");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("\nEven months");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
