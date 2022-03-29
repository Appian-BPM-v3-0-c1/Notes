public class Problems {
    package com.revature.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class ProblemTest {
        Problem problem = new Problem();

        @Test
        void reverse() {
            String test1 = "Jacob";
            String test2 = "123";
            String test3 = "a";
            String test4 = "";
            String test5 = "Jacob.Soto";

            Assertions.assertEquals("bocaJ",problem.reverse(test1));
            Assertions.assertEquals("321",problem.reverse(test2));
            Assertions.assertEquals("a",problem.reverse(test3));
            Assertions.assertEquals("",problem.reverse(test4));
            Assertions.assertEquals("otoS.bocaJ",problem.reverse(test5));

        }
    }

}
