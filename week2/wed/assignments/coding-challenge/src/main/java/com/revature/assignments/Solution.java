package com.revature.assignments;

<<<<<<< HEAD
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
=======
public class Solution {

    public int[] twoSum(int[] nums, int target) {
>>>>>>> a68b605bb1b974b35500f5c9b97c7399bfca2fd4

import java.sql.SQLOutput;
import java.util.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        //set pointer on each side of array
        int left = 0;
        int right = nums.length - 1;
        //while loop: let pointer is greater than right, loop will run
        while(left < right) {
        //if loop to see if the pointers find the indexes of nums add to the target
            if(nums[left] + nums[right] == target) {
        //return those indexes in the new int array
                return new int[] {nums[left], nums[right]};
        //else keep looking for the indexes that add to target while the sum is less than target
            } else if (nums[left] + nums[right] < target) {
            //Move left pointer through array
                left++;
            } else {
            //Move right pointer through array
                right--;
            }
        }
        //return array indexes in new int array object
        return new int[] {};
    }


    public boolean isPalindrome(int x) {

        throw new RuntimeException();
    }
}
