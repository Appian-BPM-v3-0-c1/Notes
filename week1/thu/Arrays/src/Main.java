import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr= new String[12];
        String month = " ";
        //int[]newArr = new int[]{0,0,0};
        Scanner input = new Scanner(System.in);

        for (int i =0; i < arr.length; i++) {
            System.out.println("Enter a month: ");

            month = input.nextLine();
            arr[i] = month;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n Even months: ");
        for (int i = 0; i < arr.length; i++){
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("\n Odd months: ");
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
