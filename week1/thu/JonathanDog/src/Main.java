import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);
        Dog myDog = new Dog();
        System.out.println("Enter your dog's name:");
        word = scan.next();
        myDog.setName(word);
        
        System.out.println(myDog);
    }
}
