package com.revature.junit;

import org.junit.Assert;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class MathTest {
    Math math = new Math();

    @Test
    public void reverse() {
        int test1 = 123;
        int test2 = 321;
        int test3 = -123;
        int test4 = 0;
        int test5 = -321;

        Assert.assertEquals(321, math.reverse(test1));
        Assert.assertEquals(123, math.reverse(test2));
        Assert.assertEquals(0, math.reverse(test3));
        Assert.assertEquals(0, math.reverse(test4));
        Assert.assertEquals(0, math.reverse(test5));
    }
}