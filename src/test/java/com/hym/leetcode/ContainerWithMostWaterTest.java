package com.hym.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void test1(){
        int height[] = new int[]{1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(ContainerWithMostWater11.maxArea(height), 49);
    }

    @Test
    public void test2(){
        int height[] = new int[]{1,1};
        Assert.assertEquals(ContainerWithMostWater11.maxArea(height), 1);
    }

    @Test
    public void test3(){
        int height[] = new int[]{9,8,6,2,5,4,8,9,7};
        Assert.assertEquals(ContainerWithMostWater11.maxArea(height), 63);
    }
}
