package com.revature.assignments;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void twoSum() {
        int[] arr1 = {2, 7, 11, 15};
        int t1 = 9;
        Assert.assertArrayEquals(new int[]{0,1}, solution.twoSum(arr1, t1));

        int[] arr2 = {3,2,4};
        int t2 = 6;
        Assert.assertArrayEquals(new int[]{1,2}, solution.twoSum(arr2, t2));

        int[] arr3 = {3,3};
        int t3 = 6;

        Assert.assertArrayEquals(new int[]{0,1},solution.twoSum(arr3,t3));

        int[] arr4 = {-5, -1, 0, 0, 5, 1};
        int t4 = 0;

        Assert.assertArrayEquals(new int[]{0,1,2,3,4,5}, solution.twoSum(arr4,t4));
    }

    @Test
    public void isPalindrome() {
        Assert.assertEquals(true, solution.isPalindrome(121));
        Assert.assertEquals(false, solution.isPalindrome(-123));
        Assert.assertEquals(false, solution.isPalindrome(123));
        Assert.assertEquals(true, solution.isPalindrome(101));
        Assert.assertEquals(false, solution.isPalindrome(10));
        Assert.assertEquals(true, solution.isPalindrome(0));
    }
}