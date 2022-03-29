package com.revature.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemTest {
    Problem problem = new Problem();
    @Test
    public void reverse() {
        String test1 = "bao";
        String test2 = "oab";
        String test3 = "Every day's great at your Junes";
        String test4 = "";
        String test5 = "\\u00A9\"";

        Assert.assertEquals("oab", problem.reverse(test1));
        Assert.assertEquals("bao", problem.reverse(test2));
        Assert.assertEquals("senuJ ruoy ta taerg s'yad yrevE" , problem.reverse(test3));
        Assert.assertEquals("", problem.reverse((test4)));
        Assert.assertEquals("\"9A00u\\",problem.reverse(test5));
    }
}