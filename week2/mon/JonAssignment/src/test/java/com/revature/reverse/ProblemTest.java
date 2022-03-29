package com.revature.reverse;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemTest {
    Problem problem = new Problem();
    @Test
    public void reverse() {

        String test1 = "bao";
        String test2 = "oab";
        String test3 = "";
        String test4 = "senuJ ruoy ta taerg s'yad yrevE";
        String test5 = "\u00A9";
        Assert.assertEquals("oab",
                problem.reverse(test1));
        Assert.assertEquals("bao", problem.reverse(test2));
        Assert.assertEquals("Empty String", problem.reverse(test3));
        Assert.assertEquals("Every day's great at your Junes", problem.reverse(test4));
        Assert.assertEquals("©",problem.reverse(test5));
    }
}