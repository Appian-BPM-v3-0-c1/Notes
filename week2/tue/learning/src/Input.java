import java.util.Scanner;
public class Input {
    Scanner scanner = new Scanner(System.in);

    public Input dogReq() {
        System.out.println("What is your dog's name?");
        String name = scanner.next();
        System.out.println("What is your dog's age?");
        int age = scanner.nextInt();
        System.out.println("What kind of hair does your dog have?");
        String hair = scanner.next();

//        scanner.close();

        System.out.println("Your dog's name is " + name);
        System.out.println("Your dog is " + age + " years old.");
        System.out.println("Your dog has " + hair + "hair.");


        return null;
    }


//    String name = scanner.next();
//    int age = scanner.nextInt();
//    String hair = scanner.next();

}
