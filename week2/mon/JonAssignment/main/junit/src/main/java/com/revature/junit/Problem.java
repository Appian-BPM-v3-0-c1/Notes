package com.revature.junit;

public class Problem {
    public Problem () {}
    public String reverse(String str) {
        StringBuilder s = new StringBuilder();
        s.append(str);
        return s.reverse().toString();
        //throw new RuntimeException();
    }
}
