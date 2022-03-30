package com.revature.junit;

public class Problem {

    public String reverse(String input) {

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();
        String revWord = String.valueOf(input1);

        // print reversed String
        return revWord;

    }

}
