package com.revature.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {

    Word word = new Word();

    @Test
    public void reverse(){
        String test1 = "Hello";
        String test2 = "123";
        String test3 = "";
        String test4 = "A";
        String test5 = "@#$%^%";

        Assert.assertEquals(" olleH", word.reverse(test1));
        Assert.assertEquals(" 321", word.reverse(test2));
        Assert.assertEquals(" ", word.reverse(test3));
        Assert.assertEquals(" A", word.reverse(test4));
        Assert.assertEquals(" %^%$#@", word.reverse(test5));
    }

    /*
     * TODO: reverse the string
     *  Create test cases for it (generate, test,...)
     */

}
