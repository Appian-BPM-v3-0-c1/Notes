package com.revature.assignments;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums = {};
        int target = ;




        throw new RuntimeException();
    }


    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;
        int lastNum = 0;

        while (x != 0){
            lastNum = x % 10;
            reversed = (reversed * 10) + lastNum;
            x = x / 10;
            }
        if (reversed == x){
            return true;
        }



        throw new RuntimeException();
    }
}











