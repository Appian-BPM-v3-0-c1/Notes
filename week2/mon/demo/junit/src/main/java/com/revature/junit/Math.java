package com.revature.junit;

public class Math {
    public int reverse(int num) {
        /* lastDigit gets the last digit in the num */
        int lastDigit = 0;

        /* reverse is what I'm returning */
        int reverse = 0;

        /* if the number is negative, return 0 */
        if (num < 0) {
            return 0;
        }

        /* loop to start reversing number */
        while (num > 0) {
            /* get the last digit and put it in lastDigit */
            lastDigit = num % 10;

            /* add last digit to reverse */
            reverse = (reverse * 10) + lastDigit;

            /* decrement num be 10 ex. 123 -> 12 -> 1 -> 0*/
            num = num / 10;
        }

        return reverse;
    }


}
