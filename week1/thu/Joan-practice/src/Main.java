import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[12];
        int user = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            user = scan.nextInt();
            arr[i] = user;
        }

        System.out.println(arr);
    }
}