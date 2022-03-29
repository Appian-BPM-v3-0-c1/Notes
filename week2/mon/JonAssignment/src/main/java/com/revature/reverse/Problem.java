package com.revature.reverse;

public class Problem {
    public String reverse(String s) {
        int len = s.length();
        if (len <=0) {
            return "Empty String";
        }
        char[] strArr = new char[len];
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            strArr[count] = s.charAt(i);
            count++;
        }
        return new String(strArr);
        //throw new RuntimeException();
    }
}
