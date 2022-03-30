package com.revature.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public void start() {
        int[] arr = new int[5];

        List<Integer> list = new ArrayList<>();

        int input = 0;
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (true) {
            System.out.println("Enter in a number (-1 to exit):");
            input = scan.nextInt();
            list.add(i);

            if (input == -1) {
                break;
            }

            i++;
        }

        System.out.println("Unsorted: " + list);
    }
}
