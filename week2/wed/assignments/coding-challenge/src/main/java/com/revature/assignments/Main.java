package com.revature.assignments;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution sol1 = new Solution();

        System.out.println(Arrays.toString(sol1.twoSum(new int[]{-5, -1, 0, 0 , 5, 1}, 0)));
        System.out.println();
        System.out.println("Palindrome Test:");
        System.out.println(sol1.isPalindrome(2345432));

    }

}
