package com.revature.assignments;
import java.util.Arrays;

public class Solution {
    public Solution() {}
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int count = 0;
        int[] arr = new int[0];

        for (i=0; i < nums.length; i++) {
            for (j=i + 1;j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = i;
                    count++;
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = j;
                    count++;
                }
            }
        }
        if (count > 2){
            Arrays.sort(arr);
        }
        return arr;
    }
    public boolean isPalindrome(int x) {
        int originalX = x, reversedX = 0, remainder;
        while (x != 0) {
            remainder = x % 10;
            reversedX = reversedX * 10 + remainder;
            x /= 10;
        }

        if (originalX == reversedX) {
            return true;
        }
        else {
            return false;
        }
    }
}