package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void test1(){
        Assert.assertEquals(ClimbingStairs70.climbStairs(3), 3);
    }

    @Test
    public void test2(){
        Assert.assertEquals(ClimbingStairs70.climbStairs(21), 17711);
    }
}
