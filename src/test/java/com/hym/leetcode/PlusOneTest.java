package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {
    PlusOne66 po = new PlusOne66();

    @Test
    public void test1(){
        int digits[] = new int[]{1,2,3};
        Assert.assertArrayEquals(po.plusOne(digits), new int[]{1,2,4});
    }

    @Test
    public void test2(){
        int digits[] = new int[]{9};
        Assert.assertArrayEquals(po.plusOne(digits), new int[]{1,0});
    }
}
