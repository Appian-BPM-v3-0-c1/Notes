import java.util.Scanner;

public class FinalBoss {
    public static void main(String[] args) {
        String s = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Word");

        if(s.length() >= 0){
            System.out.println(s);
        }else{
            System.out.println( s.charAt(0) +""+ s.length() + "" + s.charAt(s.length() - 1)) ;

        }

    }
}