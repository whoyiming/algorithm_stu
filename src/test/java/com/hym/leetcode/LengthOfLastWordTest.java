package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void test1(){
        Assert.assertEquals(5, LengthOfLastWord58.lengthOfLastWord("Hello World"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(4, LengthOfLastWord58.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    public void test3(){
        Assert.assertEquals(6, LengthOfLastWord58.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    public void test4(){
        Assert.assertEquals(5, LengthOfLastWord58.lengthOfLastWord("Hello"));
    }

    @Test
    public void test5(){
        Assert.assertEquals(1, LengthOfLastWord58.lengthOfLastWord(" a"));
    }
}
