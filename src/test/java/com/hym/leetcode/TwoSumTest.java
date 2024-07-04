package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void test1(){
        int nums[] = new int[]{2,7,11,15};
        int target = 9;
        Assert.assertArrayEquals(TwoSum1.twoSum(nums, target), new int[]{0,1});
    }

    @Test
    public void test2(){
        int nums[] = new int[]{3,2,4};
        int target = 6;
        Assert.assertArrayEquals(TwoSum1.twoSum(nums, target), new int[]{1,2});
    }

    @Test
    public void test3(){
        int nums[] = new int[]{3,3};
        int target = 6;
        Assert.assertArrayEquals(TwoSum1.twoSum(nums, target), new int[]{0,1});
    }
}
