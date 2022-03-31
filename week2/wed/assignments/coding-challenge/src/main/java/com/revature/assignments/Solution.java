package com.revature.assignments;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

         for (int i = 0; i < (nums.length); i++) {
             for(int j = i + 1; j < nums.length; j++)
             {
                 if(nums[i] + nums[j] == target){
                     System.out.println("The pairs are: " + nums[i] + "and " + nums[j]);
                     if(i!=j) {

                     }

                 }
             }

        }

        
        
        throw new RuntimeException();
    }


    public boolean isPalindrome(int x) {

        throw new RuntimeException();
    }
}
