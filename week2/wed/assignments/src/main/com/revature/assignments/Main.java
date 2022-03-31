package com.revature.assignments;

public class Main {

    public static void main(String[] args) {

        int nums[] = {2,7,11,15};
        int target = 9;
        int x = -121;
        int y = 123;

    Solution sol = new Solution();
    int[] nums_sol = sol.twoSum(nums, target);
    System.out.println("Solution is: ["+nums_sol[0] +","+nums_sol[1]+"]");
;
    if(sol.isPalindrome(x)){
        System.out.println("True:"+ x+" is a integer palindrone.");
    }else {
        System.out.println("False: " +x+ " is not a palindrone");
    }

    }
}
