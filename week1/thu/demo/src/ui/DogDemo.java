package ui;

import models.Dog;

import java.util.Scanner;

public class DogDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in your dog's: name, breed, color, size, hair, and age");
        Dog myDog = new Dog(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextInt());
        /* Create a dog class with private attributes name, breed, color, size, and hair */
        /* Create behavior of you dog */
        /* Create constructors for the dog class */
        /* generate toString() method */
        /* generate getters/setters for your dog class */

        System.out.println(myDog);

        System.out.println("\nIt's been a year, your dog is one year older. Please update his age");
        myDog.setAge(scan.nextInt());

        System.out.println(myDog);
    }
}
