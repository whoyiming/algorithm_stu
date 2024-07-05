package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {
    RotateArray189 ra = new RotateArray189();

    @Test
    public void test1(){
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        ra.rotate(nums, k);
        Assert.assertArrayEquals(nums, new int[]{5,6,7,1,2,3,4});
    }

    @Test
    public void test2(){
        int nums[] = new int[]{-1,-100,3,99};
        int k = 2;
        ra.rotate(nums, k);
        Assert.assertArrayEquals(nums, new int[]{3,99,-1,-100});
    }

    @Test
    public void test3(){
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k = 7;
        ra.rotate(nums, k);
        Assert.assertArrayEquals(nums, new int[]{1,2,3,4,5,6,7});
    }

    @Test
    public void test4(){
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k = 9;
        ra.rotate(nums, k);
        Assert.assertArrayEquals(nums, new int[]{6,7,1,2,3,4,5});
    }
}
