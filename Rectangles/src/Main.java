import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Rectangle rectangle = new Rectangle();
    Main main = new Main();
    Rectangle[] arr = new Rectangle[10];
    Scanner scan = new Scanner(System.in);
    Comparator comparator = new Comparator();

    for(int i  = 0; i < 3; i++) {
        System.out.println("Enter in name, width and length:");
        rectangle = new Rectangle(scan.next(), scan.nextInt(), scan.nextInt());
        arr[i] = rectangle;
    }

    }
}







