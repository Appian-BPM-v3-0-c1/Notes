import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.print("Enter a Value...");

        int userName = type.nextInt();
        int determine = userName/2;

        if(determine == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("no");
        }



    }
}
