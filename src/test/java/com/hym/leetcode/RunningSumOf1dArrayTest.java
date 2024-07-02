package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RunningSumOf1dArrayTest {

    @Test
    public void test1(){
        int[] nums = {1,2,3,4};
        Assert.assertArrayEquals(new int[]{1,3,6,10},RunningSumOf1dArray.runningSum(nums));
    }

    @Test
    public void test2(){
        int[] nums = {1,1,1,1,1};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5},RunningSumOf1dArray.runningSum(nums));
    }

    @Test
    public void test3(){
        int[] nums = {3,1,2,10,1};
        Assert.assertArrayEquals(new int[]{3,4,6,16,17},RunningSumOf1dArray.runningSum(nums));
    }
}
