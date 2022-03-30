package com.revature.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    Problem problem = new Problem();

    @Test
    void reverse() {

        String test1 = "Revature";
        String test2 = "Java";
        String test3 = "Sweta";
        String test4 = "Appian";
        String test5 = "Problem";

        Assertions.assertEquals("erutaveR", problem.reverse(test1));
        Assertions.assertEquals("avaJtus", problem.reverse(test2));
        Assertions.assertEquals("atewS", problem.reverse(test3));
        Assertions.assertEquals("naippA", problem.reverse(test4));
        Assertions.assertEquals("melborP", problem.reverse(test5));
    }
}