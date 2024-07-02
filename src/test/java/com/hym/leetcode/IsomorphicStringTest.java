package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStringTest {

    @Test
    public void test1(){
        String s = "egg", t = "add";
        Assert.assertEquals(true,IsomorphicString.isIsomorphic(s,t));
    }

    @Test
    public void test2(){
        String s = "foo", t = "bar";
        Assert.assertEquals(false,IsomorphicString.isIsomorphic(s,t));
    }

    @Test
    public void test3(){
        String s = "badc", t = "baba";
        Assert.assertEquals(false,IsomorphicString.isIsomorphic(s,t));
    }

}
