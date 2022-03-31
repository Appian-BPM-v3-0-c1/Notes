package com.revature.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution solution = new Solution();
        twoSumPrompt(scan);
        //menu();
    }

    static void twoSumPrompt(Scanner scan) {
        Solution solution = new Solution();
        int[] arr = new int[0];
        int choice = 1;
        String output = "{";

        // First part: adding numbers into the integer array

        System.out.println("\nWelcome to TwoSum Program!");
        System.out.println("Type in a number and press enter:");
        // We are assuming that this integer array has at least two integers in it
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = scan.nextInt();
        output += (arr[arr.length - 1] + ", ");
        System.out.println(("Type in a second number and press enter:"));
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = scan.nextInt();
        output += arr[arr.length - 1];
        System.out.println(output + "}");

        //Additional numbers are added here
        while (choice == 1) {
            System.out.println("Any additional numbers?");
            System.out.println("1 = Yes");
            System.out.println("2 = No");
            choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Type in an additional number and press enter:");
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = scan.nextInt();
                output += (", " + arr[arr.length - 1]);
            }
            System.out.println(output + "}");
        }

        //Second part: typing in the sum of the two numbers we are checking for

        System.out.println("\nType in the sum of the two numbers" +
                " you are checking the array for:");
        int target = scan.nextInt();

        //Third part: Calculating output from twoSum solution

        int arr2[] = solution.twoSum(arr,target);
        int count = 0;
        output = "{";
        if (arr2.length != 0) {
            output += (arr2[count]);
            count++;
            while (count != arr2.length) {
                if (arr2[count - 1] == arr2[count]) {
                    count++;
                } else {
                    if (count < arr2.length) {
                        output += ", ";
                    }
                    output += (arr2[count]);
                    count++;
                }
            }
        }
        output += "}";
        System.out.println(output);
    }
}