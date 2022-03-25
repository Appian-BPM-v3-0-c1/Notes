import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Dog myDog = new Dog();

        System.out.println("Enter your Dog's behavior");
        myDog.setBehavior(userInput.nextLine());

        System.out.println(myDog);
    }
}
