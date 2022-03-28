package com.revature.junit;

public class Math {
    public int reverse(int num) {
        int lastDigit = 0;
        int reverse = 0;

        if (num < 0) {
            return 0;
        }

        while (num > 0) {
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;

            num = num / 10;
        }

        return reverse;
    }


}
