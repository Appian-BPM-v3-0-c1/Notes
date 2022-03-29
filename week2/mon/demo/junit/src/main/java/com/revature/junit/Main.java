package com.revature.junit;

public class Main {
    public static void main(String[] args) {
        /* using the main to help pass in values to the math.reverse() method (debugging purposes) */
        int num = 10;

        Math math = new Math();

        System.out.println(math.reverse(num));
    }
}
