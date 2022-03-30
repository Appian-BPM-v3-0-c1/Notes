package com.revature.assignments;

import java.util.Arrays;

public class solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        //set pointer on each side of array
        int left = 0;
        int right = nums.length-1;
        //while loop: let pointer is greater than right, loop will run
        while(left < right) {
        //if statement to see if the pointers find the indexes of nums add to the target
            if (nums [left] + nums [right] == target) {
                //return those indexes in the new int array
                return new int[]{nums[left], nums[right]};
                //else keep looking for the indexes that add to target while the sum is less than target
            }else if (nums [left] + nums [right]< target) {
                //Move left pointer through array
                left++;
            }


            }





        throw new RuntimeException();
    }


    public boolean isPalindrome(int x) {

        throw new RuntimeException();
    }
}