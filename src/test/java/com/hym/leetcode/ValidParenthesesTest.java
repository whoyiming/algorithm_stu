package com.hym.leetcode;

import com.hym.leetcode.ValidParentheses;
import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void test1() {
        String s = "()";
        Assert.assertEquals(true, ValidParentheses.isValid(s));
    }

    @Test
    public void test2() {
        String s = "()[]{}";
        Assert.assertEquals(true, ValidParentheses.isValid(s));
    }

    @Test
    public void test3() {
        String s = "(]";
        Assert.assertEquals(false, ValidParentheses.isValid(s));
    }

    @Test
    public void test4() {
        String s = "([)]";
        Assert.assertEquals(false, ValidParentheses.isValid(s));
    }

    @Test
    public void test5() {
        String s = "{[]}";
        Assert.assertEquals(true, ValidParentheses.isValid(s));
    }

}
