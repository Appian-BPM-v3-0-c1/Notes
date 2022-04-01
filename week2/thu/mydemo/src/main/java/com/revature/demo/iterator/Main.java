package com.revature.demo.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input = 0;
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            input = scan.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<Integer> itr8r = list.iterator();

        while (itr8r.hasNext()) {
            System.out.println(itr8r.next());
        }

    }
}
