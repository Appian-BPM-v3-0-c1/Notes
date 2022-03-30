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

        Assert.assertEquals(new int[]{0, 1}, solution.twoSum(arr1, t1));

        int[] arr2 = {3, 2, 4};
        int t2 = 6;

        Assert.assertEquals(new int[]{1, 2}, solution.twoSum(arr2, t2));

        int[] arr3 = {3, 3};
        int t3 = 6;

        Assert.assertEquals(new int[]{0, 1}, solution.twoSum(arr3, t3));

        int[] arr4 = {-5, -1, 0, 0 , 5, 1};
        int t4 = 0;

        Assert.assertEquals(new int[]{0, 1, 2, 3, 4, 5, 6}, solution.twoSum(arr4, t4));
    }
}