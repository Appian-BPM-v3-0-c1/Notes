package com.revature.except.generic_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3};
        int divideByZero = 0;

        /* UNCHECKED EXCEPTION */
        /* Occur at runtime */
        try {

            /* We cannot access arr at index 3.
             * This will cause an Exception.
             */
            System.out.println(arr[3]);
        } catch (IndexOutOfBoundsException e) {

            /* Print out the Exception message*/
            System.out.println("IndexOutOfBoundException handled!");
        }

        try {

            /* We cannot divide a number by zero.
             * This will cause an Exception.
             */
            int div = 5 / 0;
        } catch (ArithmeticException e) {

            /* Print out the Exception message*/
            System.out.println("ArithmeticException handled!");
        }


        /* CHECKED EXCEPTION */
        /* Occur at compiled time */
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter("filename.txt"));
    }
}
