package com.revature.assignments;


public class Solution {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }else {
            // Store the number in a variable
            int num = x;
            // This will store the reverse of the number
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num =num/10;
            }
            return x == rev;
        }
    }
}