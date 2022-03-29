package com.revature.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {
    Problem problem = new Problem();

    @Test
    void reverse() {
        String test1 = "Joan";
        String test2 = "123";
        String test3 = "a";
        String test4 = "";
        String test5 = "Joan.Burgos";

        Assertions.assertEquals("naoJ",problem.reverse(test1));
        Assertions.assertEquals("321",problem.reverse(test2));
        Assertions.assertEquals("a",problem.reverse(test3));
        Assertions.assertEquals("",problem.reverse(test4));
        Assertions.assertEquals("sogruB.naoJ",problem.reverse(test5));
    }
}