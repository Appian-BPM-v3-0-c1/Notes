package com.revature.junit;

public class Word {

    public Object reverse(String letter){
        String lastLetter = " ";
        String reverse = " ";

        for (int i = letter.length() - 1; i >= 0; i--) {
            lastLetter = String.valueOf(letter.charAt(i));
            reverse = reverse + lastLetter;
            System.out.print(reverse);
        }
        return reverse;
    }
}
