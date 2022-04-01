package com.revature.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] solListInt;
        List<Integer> solList = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair: " + nums[i] + " & " + nums[j]);
                    if (i!=j) {
                        solList.add(i);
                        solList.add(j);
                    }
                }
            }
        }
        System.out.println("Returns: " + target);
        solListInt = convertIntegerToInt(solList);

        Arrays.sort(solListInt);
        return solListInt;
    }

    public int[] convertIntegerToInt(List<Integer> solList) {
        int[] result = new int[solList.size()];
        Iterator iterator = solList.iterator();
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) iterator.next();
        }
        return result;
    }

    public boolean isPalindrome(int x) {

       ArrayList<Integer> numbers = new ArrayList<>();

       if (x < 0) {
           x *= -1;
       }
       while (x > 0) {
           numbers.add(x % 10);
           x /= 10;
       }
       for (int i = 0, j = numbers.size()-1; i < j; i++, j--) {
           if (numbers.get(i) != numbers.get(j)){
               return false;
           }
       }

       return true;

    }
}
