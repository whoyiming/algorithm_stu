package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {
    @Test
    public void test1() {
        int nums[] = new int[]{0,1,0,3,12};
        MoveZeroes283.moveZeroes(nums);
        Assert.assertArrayEquals(nums, new int[]{1,3,12,0,0});
    }

    @Test
    public void test2() {
        int nums[] = new int[]{0};
        MoveZeroes283.moveZeroes(nums);
        Assert.assertArrayEquals(nums, new int[]{0});
    }
}
