package com.revature.demo.generics;

public class GenericMethodTest {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }
}
