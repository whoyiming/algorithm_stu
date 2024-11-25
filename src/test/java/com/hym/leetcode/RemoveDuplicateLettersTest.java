package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicateLettersTest {

    RemoveDuplicateLetters316 rdl = new RemoveDuplicateLetters316();

    @Test
    public void test1(){
        String s = "bcabc";
        Assert.assertEquals("abc", rdl.removeDuplicateLetters(s));
    }
}
